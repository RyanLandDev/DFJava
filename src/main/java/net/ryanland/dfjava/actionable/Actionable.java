package net.ryanland.dfjava.actionable;

import net.ryanland.dfjava.code.CodeLine;
import net.ryanland.dfjava.codeblocks.CodeBlock;

public interface Actionable {

    default void addAction(CodeBlock codeBlock) {
        CodeLine.ACTIVE.add(codeBlock);
    }

}
