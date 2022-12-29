package net.ryanland.dfjava.codeblocks.if_entity;

import net.ryanland.dfjava.codeblocks.SelectableCodeBlock;
import net.ryanland.dfjava.selectable.target.EntityTarget;

public abstract class IfEntity extends SelectableCodeBlock<IfEntity, EntityTarget> {

    @Override
    public String getBlock() {
        return "if_entity";
    }
}
