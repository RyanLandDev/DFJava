package net.ryanland.dfjava.selectable.impl;

import net.ryanland.dfjava.selectable.Player;
import net.ryanland.dfjava.selectable.method.SelectMethod;
import net.ryanland.dfjava.selectable.method.TargetSelectMethod;
import net.ryanland.dfjava.selectable.target.PlayerTarget;

public class PDamager implements Player {
    @Override
    public SelectMethod getSelectMethod() {
        return new TargetSelectMethod(PlayerTarget.DAMAGER);
    }
}
