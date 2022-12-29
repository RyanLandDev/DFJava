package net.ryanland.dfjava.actionable;

import net.ryanland.dfjava.code.CodeLine;
import net.ryanland.dfjava.codeblocks.CodeBlock;
import net.ryanland.dfjava.codeblocks.SelectableCodeBlock;
import net.ryanland.dfjava.codeblocks.select_object.SelectObject;
import net.ryanland.dfjava.selectable.method.SelectMethod;
import net.ryanland.dfjava.selectable.method.SelectObjectSelectMethod;
import net.ryanland.dfjava.selectable.method.TargetSelectMethod;
import net.ryanland.dfjava.codeblocks.select_object.Selection;
import net.ryanland.dfjava.selectable.target.Target;

import java.util.List;

public interface SelectableActionable extends Actionable {

    SelectMethod getSelectMethod();

    @Override
    default void addAction(CodeBlock codeBlock) {
        if (codeBlock instanceof SelectableCodeBlock) {
            SelectMethod selectMethod = getSelectMethod();
            if (selectMethod instanceof SelectObjectSelectMethod) {
                List<SelectObject> selectBlocks = ((SelectObjectSelectMethod) selectMethod).getSelectBlocks();
                if (!selectBlocks.equals(CodeLine.ACTIVE.getCurrentSelectBlocks())) {
                    CodeLine.ACTIVE.addAll(selectBlocks);
                    CodeLine.ACTIVE.setCurrentSelectBlocks(selectBlocks);
                }
            } else if (selectMethod instanceof TargetSelectMethod) {
                ((SelectableCodeBlock<?, ? extends Target>) codeBlock)
                    .setUnsafeTarget(((TargetSelectMethod) selectMethod).getTarget());
            }
        }
        Actionable.super.addAction(codeBlock);
    }
}
