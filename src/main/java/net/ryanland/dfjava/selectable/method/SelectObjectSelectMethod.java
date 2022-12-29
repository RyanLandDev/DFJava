package net.ryanland.dfjava.selectable.method;

import net.ryanland.dfjava.codeblocks.select_object.SelectObject;
import net.ryanland.dfjava.codeblocks.select_object.Selection;

import java.util.Collection;
import java.util.List;

public final class SelectObjectSelectMethod extends SelectMethod {

    private final List<SelectObject> selectBlocks;

    public SelectObjectSelectMethod(List<SelectObject> selectBlocks) {
        this.selectBlocks = selectBlocks;
    }

    public List<SelectObject> getSelectBlocks() {
        return selectBlocks;
    }

    public static SelectObjectSelectMethod of(SelectObject... selectBlocks) {
        return new SelectObjectSelectMethod(List.of(selectBlocks));
    }
}
