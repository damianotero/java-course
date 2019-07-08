package datastructures;

public class DamianQueue<T> extends DamianList<T> {


    public DamianQueue() {
        super();
    }

    public T poll() {
        if (size==0){
            throw new IndexOutOfBoundsException("Empty List!!");
        }
        T t = get(0);
        for (int i = 0; i < size() - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size]=null;
        size--;
        return t;
    }

    public T peek() {
        return get(0);
    }


}
