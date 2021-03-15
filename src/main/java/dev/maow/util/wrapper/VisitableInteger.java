package dev.maow.util.wrapper;

import dev.maow.util.AbstractVisitablePrimitive;
import dev.maow.util.visitor.PrimitiveVisitor;

public class VisitableInteger extends AbstractVisitablePrimitive<Integer> {
    public VisitableInteger(int value) {
        super(value);
    }

    @Override
    public void accept(PrimitiveVisitor visitor) {
        visitor.visitInteger(this);
    }
}
