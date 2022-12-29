package net.ryanland.dfjava.selectable.method;

import net.ryanland.dfjava.selectable.target.Target;

public final class TargetSelectMethod extends SelectMethod {

    private final Target target;

    public TargetSelectMethod(Target target) {
        this.target = target;
    }

    public Target getTarget() {
        return target;
    }
}
