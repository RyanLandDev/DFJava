package net.ryanland.dfjava.selectable.target;

class ProjectileTarget implements EntityTarget, GameValueTarget, EventTarget {

    @Override
    public String getId() {
        return "Projectile";
    }
}
