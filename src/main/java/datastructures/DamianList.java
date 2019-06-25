package datastructures;

public class DamianList {

    private int capacity;
    private String[] myArray;
    private int size=0;

    public DamianList(int capacity) {
        this.capacity = capacity;
        this.myArray = new String[capacity];
    }


    public void add(String name) {
        if (getSize() == capacity) {
            System.out.println("List full");
        } else {
            myArray[getSize()] = name;
            size++;
        }
    }

    public int getSize() {
        return size;
    }


    public void remove(int position) {

        if (position > myArray.length || position<0){
            throw new IndexOutOfBoundsException("Wrong index " + position);
        } else if(myArray[position] == null) {
            System.out.println("Position empty!");
        } else {
            for (int i = position; i < myArray.length-1; i++) {
                myArray[i] = myArray[i + 1];
            }
            myArray[myArray.length-1]=null;
            size--;
        }

    }

    public boolean contains(String name) {
        for (int i = 0; i < capacity; i++) {
            if (myArray[i].equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }



    public String get(int position) {
        return myArray[position];

    }

}
