package net.ryanland.dfjava.codeblocks.player_event;

import net.ryanland.dfjava.code.Plot;
import net.ryanland.dfjava.code.CodeLine;
import net.ryanland.dfjava.codeblocks.EventCodeBlock;
import net.ryanland.dfjava.selectable.EventSelectable;
import net.ryanland.dfjava.selectable.impl.PDefault;

public interface PlayerEvent extends EventCodeBlock {

    @Override
    default String getBlock() {
        return "event";
    }

    @Override
    default void onEvent(Plot plot, EventSelectable selectable) {
        new CodeLine().add(this);
        onTrigger(plot, (PDefault) selectable);
    }

    void onTrigger(Plot plot, PDefault player);

    @Override
    default CodeLine toCodeLine() {
        onEvent(new Plot(), new PDefault());
        return CodeLine.ACTIVE;
    }
}
