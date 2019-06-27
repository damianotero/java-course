import datastructures.DamianList;

public class Main {

    public static void main(String[] args) {


        DamianList myFiveList = new DamianList(5);

        myFiveList.add("Roi");
        myFiveList.add("Damian");
        myFiveList.add("Vodka");
        myFiveList.add("Pepe");
        myFiveList.add("Lola");


        printList(myFiveList);


        System.out.println(myFiveList.get(3));

        if (myFiveList.contains("Pepe")) {
            System.out.println("pepe found");
        }

        System.out.println("              ");

        myFiveList.remove(0);
        printList(myFiveList);
//        myFiveList.remove(3);
//        printList(myFiveList);
//
//
//        System.out.println("              ");
//        myFiveList.remove(0);
//        printList(myFiveList);
//        System.out.println("              ");
//
//        myFiveList.add("holaqase");
//        printList(myFiveList);
//
//

    }

    private static void printList(DamianList myFiveList) {

        for (int i = 0; i < myFiveList.size(); i++) {
            System.out.println(i + ". " + myFiveList.get(i));
        }
    }


}
