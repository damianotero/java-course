package datastructures;

import java.util.Objects;

public class DamianNode<T> {
    T value;
    DamianNode<T> next;


    public DamianNode(T value) {
        this.value = value;
    }

    public DamianNode getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }


    public void setNext(DamianNode<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DamianNode<?> that = (DamianNode<?>) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }

    @Override
    public String toString() {
        return "DamianNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
