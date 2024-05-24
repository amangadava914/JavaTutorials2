import java.util.*;
import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
      /*
        //we can add as many items we want
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        System.out.print("All List Items :" + list);

        System.out.println();
        //We can change our Arraylist item with the set() method
        list.set(0,11);
        System.out.print("All List Items :" + list);

        System.out.println();
        //we can check the items that are ArrayList method contains or Not (if contain the JVM print the True else False).
        System.out.print("Contains Method : " + list.contains(10));

        System.out.println();
        //isEmpty Method
        System.out.println("This List are Empty or Not : " + list.isEmpty());

        //remove() method
        System.out.println(list.remove(9);
       */

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the " + (i+1 + "th") + " item :");
            list.add(in.nextInt());
        }

        //get item from the list
        for (int j = 0; j < 5; j++) {
            System.out.print(" " + list.get(j));
        }
    }
}
