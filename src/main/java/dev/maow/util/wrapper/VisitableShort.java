package dev.maow.util.wrapper;

import dev.maow.util.AbstractVisitablePrimitive;
import dev.maow.util.visitor.PrimitiveVisitor;

public class VisitableShort extends AbstractVisitablePrimitive<Short> {
    public VisitableShort(short value) {
        super(value);
    }

    @Override
    public void accept(PrimitiveVisitor visitor) {
        visitor.visitShort(this);
    }
}
