package net.ryanland.dfjava.selectable.target;

class KillerTarget implements PlayerTarget, EntityTarget, GameValueTarget, EventTarget {

    @Override
    public String getId() {
        return "Killer";
    }
}
