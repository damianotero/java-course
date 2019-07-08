package datastructures;

public class DamianList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    public T[] data;
     int size = 0;

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
            if (data[i]==object) {
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


    private T[] grow() {
        T[] copy = (T[]) new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            copy[i] = data[i];
        }
        return copy;
    }



}


/* //TODO THIS
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    boolean add(E e);
    void add(int index, E element);
    boolean remove(Object o);
    void clear();
    boolean equals(Object o);
    E get(int index);
    E set(int index, E element);
    E remove(int index);
    int indexOf(Object o);
    int lastIndexOf(Object o);


    boolean containsAll(Collection<?> c);
    boolean addAll(Collection<? extends E> c);
    boolean addAll(int index, Collection<? extends E> c);
    boolean removeAll(Collection<?> c);

 */


