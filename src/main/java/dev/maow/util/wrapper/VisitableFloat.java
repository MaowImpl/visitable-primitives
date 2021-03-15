package dev.maow.util.wrapper;

import dev.maow.util.AbstractVisitablePrimitive;
import dev.maow.util.visitor.PrimitiveVisitor;

public class VisitableFloat extends AbstractVisitablePrimitive<Float> {
    public VisitableFloat(float value) {
        super(value);
    }

    @Override
    public void accept(PrimitiveVisitor visitor) {
        visitor.visitFloat(this);
    }
}
