package net.ryanland.dfjava.codeblocks.player_event;

/**
 * Triggered whenever a player joins the plot.
 */
public abstract class PlayerJoinEvent implements PlayerEvent {

    @Override
    public String getAction() {
        return "Join";
    }
}
