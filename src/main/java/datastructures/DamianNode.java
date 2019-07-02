package datastructures;

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
}
