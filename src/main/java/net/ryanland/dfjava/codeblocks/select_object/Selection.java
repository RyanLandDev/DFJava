package net.ryanland.dfjava.codeblocks.select_object;

import net.ryanland.dfjava.actionable.Messageable;
import net.ryanland.dfjava.code.Tag;
import net.ryanland.dfjava.code.condition.Condition;
import net.ryanland.dfjava.selectable.method.SelectMethod;
import net.ryanland.dfjava.selectable.method.SelectObjectSelectMethod;

import java.util.ArrayList;
import java.util.List;

public interface Selection extends Messageable {

    SelectMethod getSelectMethod();

    default Selection filter(Condition condition) {
        return () -> {
            List<SelectObject> selectBlocks = new ArrayList<>(((SelectObjectSelectMethod)
                Selection.this.getSelectMethod()).getSelectBlocks());
            selectBlocks.add(new FilterConditionSelection(condition));
            return new SelectObjectSelectMethod(selectBlocks);
        };
    }
}
