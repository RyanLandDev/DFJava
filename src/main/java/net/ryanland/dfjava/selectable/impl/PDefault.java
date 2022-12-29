package net.ryanland.dfjava.selectable.impl;

import net.ryanland.dfjava.code.CodeLine;
import net.ryanland.dfjava.codeblocks.select_object.SelectObject;
import net.ryanland.dfjava.selectable.Player;
import net.ryanland.dfjava.selectable.method.SelectMethod;
import net.ryanland.dfjava.selectable.method.TargetSelectMethod;
import net.ryanland.dfjava.selectable.target.PlayerTarget;

import java.util.List;

public class PDefault implements Player {
    @Override
    public SelectMethod getSelectMethod() {
        List<SelectObject> selectBlocks = CodeLine.ACTIVE.getCurrentSelectBlocks();
        return new TargetSelectMethod((selectBlocks == null || selectBlocks.isEmpty()) ? PlayerTarget.SELECTION : PlayerTarget.DEFAULT);
    }
}
