package net.ryanland.dfjava.codeblocks;

import net.ryanland.dfjava.code.CodeLine;
import net.ryanland.dfjava.code.Plot;
import net.ryanland.dfjava.selectable.EventSelectable;

public interface EventCodeBlock extends CodeBlock {

    void onEvent(Plot plot, EventSelectable selectable);

    CodeLine toCodeLine();
}
