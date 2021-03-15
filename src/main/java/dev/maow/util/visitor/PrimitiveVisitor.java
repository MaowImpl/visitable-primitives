package dev.maow.util.visitor;

import dev.maow.util.VisitablePrimitive;
import dev.maow.util.wrapper.*;

public interface PrimitiveVisitor {
    void visit(VisitablePrimitive<?> visitable);

    void visitBoolean(VisitableBoolean visitableBoolean);

    void visitByte(VisitableByte visitableByte);

    void visitShort(VisitableShort visitableShort);

    void visitInteger(VisitableInteger visitableInteger);

    void visitLong(VisitableLong visitableLong);

    void visitFloat(VisitableFloat visitableFloat);

    void visitDouble(VisitableDouble visitableDouble);

    void visitCharacter(VisitableCharacter visitableCharacter);
}