package datastructures;

import java.util.Stack;

public class DamianStack<T> extends DamianList<T>{

    public DamianStack() {
        super();
    }



    public void push(T object) {
        if (size == data.length) {
            data=grow();
        }
        data[size] = object;
        size++;
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


}



