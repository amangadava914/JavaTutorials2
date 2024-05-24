import java.util.*;
import java.util.ArrayList;

public class MultiDimensional_ArrayList {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialization of MultiDimensional ArrayList
        for (int i = 0; i < 3; i++) { //The Size of the MultiDimensional ArrayList
            list.add(new ArrayList<>());
        }

        //Add Items
        for (int i = 0; i < 3; i++) { //for Rows
            for (int j = 0; j < 3; j++) {  //for Columns
                list.get(i).add(in.nextInt());
            }
        }

        // Print Items
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
