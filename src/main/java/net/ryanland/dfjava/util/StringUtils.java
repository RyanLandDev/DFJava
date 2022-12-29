package net.ryanland.dfjava.util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.GZIPOutputStream;

public class StringUtils {

    public static String convertColors(String input) {
        return input.replaceAll("&(?=[0-9A-Fa-frlonmkx])", "§");
    }

    // code from recode
    public static String compressGzipBase64(String uncompressed) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream(uncompressed.length());
            GZIPOutputStream gzip = new GZIPOutputStream(bos);

            // Convert to gzip
            gzip.write(uncompressed.getBytes());
            gzip.close();
            byte[] compressed = bos.toByteArray();
            bos.close();

            // Convert to base64 and returns it
            return new String(Base64.getEncoder().encode(compressed), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
