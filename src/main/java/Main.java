import datastructures.DamianStack;

public class Main {

    public static void main(String[] args) {


        DamianStack<Integer> myIntStack = new DamianStack<>(5);

        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.push(3);
        myIntStack.push(4);




        System.out.println("   ");


        System.out.println(myIntStack.pop());
        System.out.println(myIntStack.pop());
        System.out.println(myIntStack.pop());
        System.out.println(myIntStack.pop());
        System.out.println(myIntStack.pop());



    }
}
