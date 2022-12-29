package net.ryanland.dfjava.codeblocks.player_action;

import net.ryanland.dfjava.codeblocks.SelectableCodeBlock;
import net.ryanland.dfjava.selectable.target.PlayerTarget;

public abstract class PlayerAction extends SelectableCodeBlock<PlayerAction, PlayerTarget> {

    @Override
    public String getBlock() {
        return "player_action";
    }
}
