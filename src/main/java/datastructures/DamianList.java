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

    public boolean contains(T object) {
        for (int i = 0; i < size; i++) {
            if (data[i] == object) {
                return true;
            }
        }
        return false;
    }

    public T get(int position) {
        return data[position];
    }

    private void checkBounds(int position) {
        if (position > data.length || position < 0) {
            throw new IndexOutOfBoundsException("Wrong index " + position);
        }
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
            if (data[i] == value) {
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
        for (int i = 0; i < list.size; i++) {
            if (!contains(list.data[i])) {
                return false;
            }
        }
        return true;
    }

    public void addAll(DamianList<T> list) {
        if (list.size != 0)
            for (int i = 0; i < list.size; i++) {
                add(list.data[i]);
            }
    }

    public void removeAll(DamianList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            T t = list.data[i];
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
        return Arrays.equals(data, that.data);
    }

//    @Override
//    public int hashCode() {
//        return Arrays.hashCode(data);
//    }
}




/* //TODO THIS
    int size();    CHECK
    boolean isEmpty(); CHECK
    boolean contains(Object o); CHECK
    boolean add(E e); CHECK
    void add(int index, E element); CHECK
    boolean remove(Object o); CHECK
    void clear();    CHECK
    boolean equals(Object o); check
    E get(int index); check
    E set(int index, E element); check
    E remove(int index); check
    int indexOf(Object o); check
    int lastIndexOf(Object o); check


    boolean containsAll(Collection<?> c);  CHECK
    boolean addAll(Collection<? extends E> c);
    boolean addAll(int index, Collection<? extends E> c);
    boolean removeAll(Collection<?> c);

 */


