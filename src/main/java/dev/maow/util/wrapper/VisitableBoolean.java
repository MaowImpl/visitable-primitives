package dev.maow.util.wrapper;

import dev.maow.util.AbstractVisitablePrimitive;
import dev.maow.util.visitor.PrimitiveVisitor;

public class VisitableBoolean extends AbstractVisitablePrimitive<Boolean> {
    public VisitableBoolean(boolean value) {
        super(value);
    }

    @Override
    public void accept(PrimitiveVisitor visitor) {
        visitor.visitBoolean(this);
    }
}