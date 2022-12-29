package net.ryanland.dfjava.codeblocks.select_object;

import net.ryanland.dfjava.code.Tag;
import net.ryanland.dfjava.selectable.method.SelectMethod;
import net.ryanland.dfjava.selectable.method.SelectObjectSelectMethod;
import net.ryanland.dfjava.selectable.target.EventTarget;
import net.ryanland.dfjava.value.Value;

import java.util.List;

public class EventTargetSelection extends SelectObject {

    private final EventTarget target;

    public EventTargetSelection(EventTarget target) {
        this.target = target;
    }

    public EventTarget getTarget() {
        return target;
    }

    @Override
    public List<Value> getParameters() {
        return null;
    }

    @Override
    public List<Tag> getTags() {
        return List.of(new Tag("Event Target", target.getId()));
    }

    @Override
    public String getAction() {
        return "EventTarget";
    }

    @Override
    public SelectMethod getSelectMethod() {
        return SelectObjectSelectMethod.of(this);
    }
}
