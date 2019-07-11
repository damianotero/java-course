package datastructures;

public class DamianQueue<T> {

    private DamianLinkedList<T> data;


    public DamianQueue() {
        this.data = new DamianLinkedList();
    }



    public T poll() {
        if (data.size() == 0) {
            throw new IndexOutOfBoundsException("Empty List!!");
        }
        T t = data.get(0);
        data.remove(0);
        return t;
    }

    public T peek() {
        return data.get(0);
    }


    public void add(T value) {
        data.add(value);
    }

    public void add(int position, T value) {
        data.add(position, value);
    }

    public void remove(int position) {
        data.remove(position);
    }

    public T get(int position) {
        return data.get(position);
    }

    public int size() {
        return data.size();
    }
}
