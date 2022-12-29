package net.ryanland.dfjava.codeblocks.entity_action;

import net.ryanland.dfjava.codeblocks.SelectableCodeBlock;
import net.ryanland.dfjava.selectable.target.EntityTarget;

public abstract class EntityAction extends SelectableCodeBlock<EntityAction, EntityTarget> {

    @Override
    public String getBlock() {
        return "entity_action";
    }
}
