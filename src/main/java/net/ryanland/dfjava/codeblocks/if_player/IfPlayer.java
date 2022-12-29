package net.ryanland.dfjava.codeblocks.if_player;

import net.ryanland.dfjava.codeblocks.SelectableCodeBlock;
import net.ryanland.dfjava.selectable.target.PlayerTarget;

public abstract class IfPlayer extends SelectableCodeBlock<IfPlayer, PlayerTarget> {

    @Override
    public String getBlock() {
        return "if_player";
    }
}
