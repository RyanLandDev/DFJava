package net.ryanland.dfjava.code.condition;

import net.ryanland.dfjava.value.Value;

public abstract class VariableCondition extends Condition {

    public VariableCondition(Value... parameters) {
        super(parameters);
    }
}
