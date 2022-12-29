package net.ryanland.dfjava.selectable.target;

import net.ryanland.dfjava.selectable.Selectable;

public sealed interface Target extends Selectable permits EntityTarget, EventTarget, GameValueTarget, PlayerTarget {

    String getId();

}
