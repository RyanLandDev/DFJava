package net.ryanland.dfjava;

import com.google.gson.JsonObject;
import net.ryanland.dfjava.code.CodeLine;
import net.ryanland.dfjava.code.Plot;
import net.ryanland.dfjava.codeblocks.EventCodeBlock;
import net.ryanland.dfjava.util.StringUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPOutputStream;

public class DFJava {

    // builder -----------------------------------------------

    private static final List<CodeLine> codeLines = new ArrayList<>();

    public static void addEvents(EventCodeBlock... events) {
        codeLines.addAll(Arrays.stream(events).map(EventCodeBlock::toCodeLine).toList());
    }

    public static void addCodeLines(CodeLine... codeLines) {
        DFJava.codeLines.addAll(List.of(codeLines));
    }

    // sender -----------------------------------------------

    public static void sendTemplates() {
        for (CodeLine codeLine : codeLines) {
            sendTemplate(codeLine.toJson(), codeLine.getCodeBlocks().get(0).getClass().getName());
        }
    }

    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(1);

    private static void sendTemplate(JsonObject template, String name) {
        EXECUTOR.execute(() -> {
            try {
                Socket socket = new Socket("localhost", 31372);
                String templateString = template.toString();

                JsonObject json = new JsonObject();
                json.addProperty("type", "template");
                JsonObject data = new JsonObject();
                data.addProperty("data", StringUtils.compressGzipBase64(templateString));
                data.addProperty("name", name);
                json.addProperty("data", data.toString());
                json.addProperty("source", "DFJava");

                System.out.println(StringUtils.compressGzipBase64(templateString));

                OutputStream output = socket.getOutputStream();
                output.write((json.toString() + '\n').getBytes(StandardCharsets.UTF_8));
                output.flush();

                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}
