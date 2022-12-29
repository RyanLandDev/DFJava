package net.ryanland.dfjava.code.condition;

import net.ryanland.dfjava.code.Tag;
import net.ryanland.dfjava.value.Value;

import java.util.List;

public abstract class Condition {

    protected List<Value> parameters;
    protected boolean not = false;

    public Condition(Value... parameters) {
        this.parameters = List.of(parameters);
    }

    public final Condition setParameters(List<Value> parameters) {
        this.parameters = parameters;
        return this;
    }

    public final Condition not() {
        not = true;
        return this;
    }

    public final List<Value> getParameters() {
        return parameters;
    }

    public final boolean isNot() {
        return not;
    }

    /**
     * The action name for this condition in an If block.
     */
    public abstract String getAction();

    /**
     * The action name for this condition in a Select Object block.
     * <p>This is the same as {@link #getAction()} in most cases, but could be different (e.g. IsWearing -> PIsWearing).
     */
    public String getSelectAction() {
        return getAction();
    }

    public List<Tag> getTags() {
        return List.of();
    }
}
