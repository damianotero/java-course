package datastructures;

public class DamianStack<T> {


    private T[] myArray;
    private int size = 0;

    public DamianStack(int capacity) {
        this.myArray = (T[]) new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public void push(T object) {
        if (size == myArray.length) {
            throw new RuntimeException("Stack is full");
        } else {
            for (int i = 0; i < myArray.length; i++)
                if (myArray[i] == null) {
                    myArray[i] = object;
                    size++;
                    break;
                }
        }
    }

    public T pop() {
        if (myArray[0] == null) {
            throw new RuntimeException("Stack is empty");
        }
        T object = myArray[size - 1];
        myArray[size - 1] = null;
        size--;
        return object;
    }

    public boolean contains(T object) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == object) {
                return true;
            }
        }
        return false;
    }
}


