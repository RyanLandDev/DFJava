package net.ryanland.dfjava.codeblocks;

import com.google.gson.JsonObject;

public interface CodeBlock {

    String getBlock();

    String getAction();

    default JsonObject toJson() {
        JsonObject json = new JsonObject();
        json.addProperty("id", "block");
        json.addProperty("block", getBlock());
        json.addProperty("action", getAction());
        return json;
    }
}
