package datastructures;

public class DamianLinkedList<T> {

    private DamianNode<T> head;
    private int size = 0;

    public void add(T value) {
        DamianNode<T> newNode = new DamianNode<>(value);
        if (head == null) {
            head = newNode;
        } else {
            DamianNode<T> t = head;
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.setNext(newNode);
        }
        size++;
    }

    public void add(int position, T value) {
        DamianNode<T> newNode = new DamianNode<>(value);
        if (position == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            newNode.setNext(getNode(position));
            getNode(position - 1).setNext(newNode);
        }
        size++;
    }

    public T get(int position) {
        return getNode(position).getValue();
    }

    public DamianNode<T> getNode(int position) {
        DamianNode<T> t = head;
        for (int i = 0; i < position; i++) {
            t = t.getNext();
        }
        return t;
    }

    public void remove(int position) {
        DamianNode<T> t = getNode(position - 1);
        t.setNext(t.getNext().getNext());
        size--;
    }

    public int getSize() {
        return size;
    }
}
