package net.ryanland.dfjava.selectable.target;

class DefaultTarget implements PlayerTarget, EntityTarget, GameValueTarget, EventTarget {

    @Override
    public String getId() {
        return "Default";
    }
}
