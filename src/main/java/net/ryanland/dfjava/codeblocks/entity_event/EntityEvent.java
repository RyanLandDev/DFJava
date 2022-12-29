package net.ryanland.dfjava.codeblocks.entity_event;

import net.ryanland.dfjava.code.CodeLine;
import net.ryanland.dfjava.code.Plot;
import net.ryanland.dfjava.codeblocks.EventCodeBlock;
import net.ryanland.dfjava.selectable.Entity;
import net.ryanland.dfjava.selectable.EventSelectable;
import net.ryanland.dfjava.selectable.impl.EDefault;

public interface EntityEvent extends EventCodeBlock {

    @Override
    default String getBlock() {
        return "entity_event";
    }

    @Override
    default void onEvent(Plot plot, EventSelectable selectable) {
        new CodeLine().add(this);
        onTrigger(plot, (EDefault) selectable);
    }

    void onTrigger(Plot plot, EDefault entity);

    @Override
    default CodeLine toCodeLine() {
        onEvent(new Plot(), new EDefault());
        return CodeLine.ACTIVE;
    }
}
