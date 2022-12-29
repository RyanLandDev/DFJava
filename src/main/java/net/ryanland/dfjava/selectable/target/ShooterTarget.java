package net.ryanland.dfjava.selectable.target;

class ShooterTarget implements PlayerTarget, EntityTarget, GameValueTarget, EventTarget {

    @Override
    public String getId() {
        return "Shooter";
    }
}
