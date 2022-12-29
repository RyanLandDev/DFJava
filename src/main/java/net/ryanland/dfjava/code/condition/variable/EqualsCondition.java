package net.ryanland.dfjava.code.condition.variable;

import net.ryanland.dfjava.code.condition.VariableCondition;
import net.ryanland.dfjava.value.Value;

public class EqualsCondition extends VariableCondition {

    public EqualsCondition(Value... parameters) {
        super(parameters);
    }

    @Override
    public String getAction() {
        return "=";
    }
}
