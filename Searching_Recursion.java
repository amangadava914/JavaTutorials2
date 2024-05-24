import java.util.ArrayList;

public class Searching_Recursion {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,90,67,22,88,9,77,33,9,65,55};
        //System.out.println(searching(arr, 22, 0));
        System.out.println(findIndex(arr, 0,0));
        findAllIndex(arr, 9, 0);
        System.out.println(list);

        //System.out.println(findAllTheIndex(arr, 9, 0, new ArrayList<>()));
        ArrayList<Integer> ans = findAllTheIndex(arr, 9, 0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(list); //findAllIndex2
    }

    static boolean searching(int[] arr, int target, int index){
        // Base Condition
        if(index == arr.length){
            return true;
        }

        return arr[index] == target || searching(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        else if (arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){ // finds duplicates target indexes
        if (index == arr.length){
            return;
        }
        else if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllTheIndex(int[] arr, int target, int index, ArrayList<Integer> list){ // finds duplicates target indexes
        if (index == arr.length){
            return list;
        }
        else if (arr[index] == target){
            list.add(index);
        }
        return findAllTheIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function call only.
       else if (arr[index] == target){
            list.add(index);
        }

       ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
       list.addAll(ansFromBelowCalls);
       return list;
    }
}
