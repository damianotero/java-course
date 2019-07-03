package datastructures;

public class DamianStack<T> {


    private T[] data;
    private int size = 0;

    public DamianStack(int capacity) {
        this.data = (T[]) new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public void addToPosition(int position, T value){
        if (size == data.length) {
            throw new RuntimeException("Stack is full");
        }

    }

    public void push(T object) {
        if (size == data.length) {
            throw new RuntimeException("Stack is full");
        } else {
            for (int i = 0; i < data.length; i++)
                if (data[i] == null) {
                    data[i] = object;
                    size++;
                    break;
                }
        }
    }

    public T pop() {
        if (data[0] == null) {
            throw new RuntimeException("Stack is empty");
        }
        T object = data[size - 1];
        data[size - 1] = null;
        size--;
        return object;
    }

    public boolean contains(T object) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == object) {
                return true;
            }
        }
        return false;
    }
}


