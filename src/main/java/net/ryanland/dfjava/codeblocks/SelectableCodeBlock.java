package net.ryanland.dfjava.codeblocks;

import com.google.gson.JsonObject;
import net.ryanland.dfjava.selectable.target.PlayerTarget;
import net.ryanland.dfjava.selectable.target.Target;

import java.util.Objects;

// player action, if player, entity action, if entity
public abstract class SelectableCodeBlock<S extends SelectableCodeBlock<S, T>, T extends Target> implements ChestCodeBlock {

    private T target;

    public T getTarget() {
        return target;
    }

    public void setUnsafeTarget(Target target) {
        this.target = (T) target;
    }

    public S setTarget(T target) {
        this.target = target;
        return (S) this;
    }

    @Override
    public JsonObject toJson() {
        JsonObject json = ChestCodeBlock.super.toJson();
        if (target != null && !target.getId().equals("Selection")) json.addProperty("target", target.getId());
        return json;
    }
}
