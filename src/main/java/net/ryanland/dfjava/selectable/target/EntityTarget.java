package net.ryanland.dfjava.selectable.target;

public non-sealed interface EntityTarget extends Target {

    EntityTarget ALL_ENTITIES = new AllEntitiesTarget();
    EntityTarget ALL_MOBS = new AllMobsTarget();
    EntityTarget DAMAGER = new DamagerTarget();
    EntityTarget DEFAULT = new DefaultTarget();
    EntityTarget KILLER = new KillerTarget();
    EntityTarget LAST_ENTITY = new LastEntityTarget();
    EntityTarget PROJECTILE = new ProjectileTarget();
    EntityTarget SELECTION = new SelectionTarget();
    EntityTarget SHOOTER = new ShooterTarget();
    EntityTarget VICTIM = new VictimTarget();

}
