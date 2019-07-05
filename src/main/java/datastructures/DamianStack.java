package datastructures;

public class DamianStack<T> {


    private T[] data;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    public DamianStack() {
        this.data = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void addToPosition(int position, T value) {
        if (position > size || position < 0) {
            throw new IndexOutOfBoundsException("Wrong index " + position);
        }
        if (size == data.length) {
            grow();
        }
        for (int i = size - 1; i > position; i--) {
            data[i] = data[i - 1];
        }
        data[position] = value;
        size++;
    }

    public void push(T object) {
        if (size == data.length) {
            grow();
        }
        data[size] = object;
        size++;
    }

    private void grow() {
        T[] data2 = (T[]) new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            data2[i] = data[i];
        }
        data = data2;
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

    public T get(int position) {
        return data[position];
    }

}


