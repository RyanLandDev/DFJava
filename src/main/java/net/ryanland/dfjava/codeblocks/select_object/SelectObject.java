package net.ryanland.dfjava.codeblocks.select_object;

import com.google.gson.JsonObject;
import net.ryanland.dfjava.codeblocks.ChestCodeBlock;

public abstract class SelectObject implements ChestCodeBlock, Selection {

    @Override
    public String getBlock() {
        return "select_obj";
    }

    public String getSubAction() {
        return null;
    }

    @Override
    public JsonObject toJson() {
        JsonObject json = ChestCodeBlock.super.toJson();
        if (getSubAction() == null) return json;
        json.addProperty("subAction", getSubAction());
        return json;
    }
}
