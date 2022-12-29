package net.ryanland.dfjava.actionable;

import net.ryanland.dfjava.codeblocks.player_action.PlayerSendMessageAction;
import net.ryanland.dfjava.util.StringUtils;
import net.ryanland.dfjava.value.Text;
import net.ryanland.dfjava.value.Value;

import java.util.Collection;
import java.util.List;

public interface Messageable extends SelectableActionable {

    default void message(String text) {
        message(text, false, false);
    }

    default void message(String text, boolean addSpaces, boolean alignCenter) {
        message(new Text(StringUtils.convertColors(text)), addSpaces, alignCenter);
    }

    default void message(Text text) {
        message((Value) text);
    }

    default void message(Text text, boolean addSpaces, boolean alignCenter) {
        message(addSpaces, alignCenter, text);
    }

    default void message(Value... values) {
        message(false, false, values);
    }

    default void message(boolean addSpaces, boolean alignCenter, Value... values) {
        message(List.of(values), addSpaces, alignCenter);
    }

    default void message(Collection<Value> values, boolean addSpaces, boolean alignCenter) {
        addAction(new PlayerSendMessageAction(values, addSpaces, alignCenter));
    }

}