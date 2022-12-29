package net.ryanland.dfjava.selectable.target;

public non-sealed interface GameValueTarget extends Target {

    GameValueTarget DAMAGER = new DamagerTarget();
    GameValueTarget DEFAULT = new DefaultTarget();
    GameValueTarget KILLER = new KillerTarget();
    GameValueTarget LAST_ENTITY = new LastEntityTarget();
    GameValueTarget PROJECTILE = new ProjectileTarget();
    GameValueTarget SELECTION = new SelectionTarget();
    GameValueTarget SHOOTER = new ShooterTarget();
    GameValueTarget VICTIM = new VictimTarget();

}
