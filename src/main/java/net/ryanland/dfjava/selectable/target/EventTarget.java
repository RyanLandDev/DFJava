package net.ryanland.dfjava.selectable.target;

public non-sealed interface EventTarget extends Target {

    EventTarget DAMAGER = new DamagerTarget();
    EventTarget DEFAULT = new DefaultTarget();
    EventTarget KILLER = new KillerTarget();
    EventTarget PROJECTILE = new ProjectileTarget();
    EventTarget SHOOTER = new ShooterTarget();
    EventTarget VICTIM = new VictimTarget();

}
