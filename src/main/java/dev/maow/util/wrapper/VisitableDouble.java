package dev.maow.util.wrapper;

import dev.maow.util.AbstractVisitablePrimitive;
import dev.maow.util.visitor.PrimitiveVisitor;

public class VisitableDouble extends AbstractVisitablePrimitive<Double> {
    public VisitableDouble(double value) {
        super(value);
    }

    @Override
    public void accept(PrimitiveVisitor visitor) {
        visitor.visitDouble(this);
    }
}
