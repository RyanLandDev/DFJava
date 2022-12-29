package net.ryanland.dfjava.code;

import net.ryanland.dfjava.actionable.Messageable;
import net.ryanland.dfjava.selectable.method.SelectMethod;
import net.ryanland.dfjava.selectable.method.TargetSelectMethod;
import net.ryanland.dfjava.selectable.target.PlayerTarget;

public class Plot implements Messageable {

    @Override
    public SelectMethod getSelectMethod() {
        return new TargetSelectMethod(PlayerTarget.ALL_PLAYERS);
    }
}
