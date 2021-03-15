package dev.maow.util;

import dev.maow.util.visitor.PrimitiveVisitor;

public interface VisitablePrimitive<T> {
    void accept(PrimitiveVisitor visitor);

    T get();

    void set(T value);
}
