package net.ryanland.dfjava.codeblocks.player_action;

import net.ryanland.dfjava.code.Tag;
import net.ryanland.dfjava.value.Value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PlayerSendMessageAction extends PlayerAction {

    private final List<Value> valuesToSend;
    private boolean addSpaces;
    private boolean alignCenter;

    public PlayerSendMessageAction(Value... valuesToSend) {
        this(List.of(valuesToSend), false, false);
    }

    public PlayerSendMessageAction(Collection<Value> valuesToSend, boolean addSpaces, boolean alignCenter) {
        this.valuesToSend = new ArrayList<>(valuesToSend);
        this.addSpaces = addSpaces;
        this.alignCenter = alignCenter;
    }

    public PlayerSendMessageAction addSpaces() {
        addSpaces = true;
        return this;
    }

    public PlayerSendMessageAction alignCenter() {
        alignCenter = true;
        return this;
    }

    @Override
    public String getAction() {
        return "SendMessage";
    }

    @Override
    public List<Value> getParameters() {
        return valuesToSend;
    }

    @Override
    public List<Tag> getTags() {
        return List.of(new Tag("Text Value Merging", addSpaces ? "Add spaces" : "No spaces"),
            new Tag("Alignment Mode", alignCenter ? "Centered" : "Regular"));
    }

}
