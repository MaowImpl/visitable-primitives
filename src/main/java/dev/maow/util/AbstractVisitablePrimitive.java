package dev.maow.util;

public abstract class AbstractVisitablePrimitive<T> implements VisitablePrimitive<T> {
    private T value;

    public AbstractVisitablePrimitive(T value) {
        this.value = value;
    }

    @Override
    public T get() {
        return value;
    }

    @Override
    public void set(T value) {
        this.value = value;
    }
}
