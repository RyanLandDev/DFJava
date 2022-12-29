package net.ryanland.dfjava.codeblocks.select_object;

import net.ryanland.dfjava.code.Tag;
import net.ryanland.dfjava.code.condition.Condition;
import net.ryanland.dfjava.selectable.method.SelectMethod;
import net.ryanland.dfjava.selectable.method.SelectObjectSelectMethod;
import net.ryanland.dfjava.value.Value;

import java.util.List;

public class FilterConditionSelection extends SelectObject {

    private final Condition condition;

    public FilterConditionSelection(Condition condition) {
        this.condition = condition;
    }

    @Override
    public List<Value> getParameters() {
        return condition.getParameters();
    }

    @Override
    public List<Tag> getTags() {
        return condition.getTags();
    }

    @Override
    public String getAction() {
        return "FilterCondition";
    }

    @Override
    public String getSubAction() {
        return condition.getSelectAction();
    }

    @Override
    public SelectMethod getSelectMethod() {
        return SelectObjectSelectMethod.of(this);
    }
}
