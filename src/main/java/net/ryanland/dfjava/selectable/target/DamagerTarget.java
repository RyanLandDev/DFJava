package net.ryanland.dfjava.selectable.target;

class DamagerTarget implements PlayerTarget, EntityTarget, GameValueTarget, EventTarget {

    @Override
    public String getId() {
        return "Damager";
    }
}
