package net.ryanland.dfjava.selectable.target;

public non-sealed interface PlayerTarget extends Target {

    PlayerTarget ALL_PLAYERS = new AllPlayersTarget();
    PlayerTarget DAMAGER = new DamagerTarget();
    PlayerTarget DEFAULT = new DefaultTarget();
    PlayerTarget KILLER = new KillerTarget();
    PlayerTarget SELECTION = new SelectionTarget();
    PlayerTarget SHOOTER = new ShooterTarget();
    PlayerTarget VICTIM = new VictimTarget();

}
