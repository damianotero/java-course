package datastructures;

public class DamianLinkedList<T> {

    DamianNode<T> head;
    int size;

    public void add(T value) {
        if (head == null) {
            head=new DamianNode<>(value);
        }
        if (head.next==null){
            head.setNext();
        }

    }


}
