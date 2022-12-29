package net.ryanland.dfjava.selectable.target;

class VictimTarget implements PlayerTarget, EntityTarget, GameValueTarget, EventTarget {

    @Override
    public String getId() {
        return "Victim";
    }
}
