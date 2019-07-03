package datastructures;

public class DamianList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private T[] data;
    private int size = 0;

    public DamianList() {
        this(DEFAULT_CAPACITY);
    }

    public DamianList(int capacity) {
        this.data = (T[]) new Object[capacity];
    }

    public void add(T value) {
        if (size == data.length) {
            data = grow();
        }
        data[size++] = value;
    }

    private T[] grow() {
        T[] copy = (T[]) new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            copy[i] = data[i];
        }
        return copy;
    }

    public void addToPosition(int position, T value) {
        if (position > size || position < 0) {
            throw new IndexOutOfBoundsException("Wrong index " + position);
        }
        if (size == data.length) {
            data = grow();
        }

        for (int i = size - 1; i > position; i--) {
            data[i] = data[i - 1];
        }
        data[position] = value;
        size++;
    }

    public int size() {
        return size;
    }


    public void remove(int position) {

        checkBounds(position);

        if (data[position] == null) {
            throw new RuntimeException(position + " is empty!");
        } else {
            for (int i = position; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data[data.length - 1] = null;
            size--;
        }
    }

    private void checkBounds(int position) {
        if (position > data.length || position < 0) {
            throw new IndexOutOfBoundsException("Wrong index " + position);
        }
    }

    public boolean contains(String name) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    public T get(int position) {
        return data[position];
    }

}
