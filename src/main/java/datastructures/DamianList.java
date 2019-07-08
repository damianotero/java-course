package datastructures;

import java.util.Arrays;

public class DamianList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    protected T[] data;
    protected int size = 0;

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

    public void add(int position, T value) {
        checkBounds(position);

        if (size == data.length) {
            data = grow();
        }

        for (int i = size - 1; i > position; i--) {
            data[i] = data[i - 1];
        }
        data[position] = value;
        size++;
    }

    public void remove(int position) {
        checkBounds(position);

        for (int i = position; i < size()-1; i++) {
            data[i] = data[i + 1];
        }
        data[size()] = null;
        size--;

    }

    public boolean contains(T object) {
        for (int i = 0; i < size(); i++) {
            if (data[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public T get(int position) {
        return data[position];
    }

    public int size() {
        return size;
    }


    protected T[] grow() {
        T[] copy = (T[]) new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            copy[i] = data[i];
        }
        return copy;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!isEmpty()) {
            T[] data2 = (T[]) new Object[DEFAULT_CAPACITY];
            data = data2;
            size = 0;
        }
    }


    public void set(int position, T value) {
        checkBounds(position);
        data[position] = value;
    }

    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T value) {
        for (int i = size; i > 0; i--) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean containsAll(DamianList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!contains(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void addAll(DamianList<T> list) {
        if (list.size() != 0)
            for (int i = 0; i < list.size(); i++) {
                add(list.get(i));
            }
    }

    public void removeAll(DamianList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            if (contains(t)) {
                remove(indexOf(t));
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DamianList<?> that = (DamianList<?>) o;

        if (size != that.size()) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (!data[i].equals( that.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "DamianList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    private void checkBounds(int position) {
        if (position >= size || position < 0) {
            throw new IndexOutOfBoundsException("Wrong index " + position);
        }
    }

}


