import java.util.Scanner;

public class LinearSearch_String {
    public static void main(String[] args){
        String str = "Aman is the bravest boy!";
        char target = 'b';
        int ans = String_Search(str, target);
        System.out.print("Target String/Char present at index : " + ans);
    }

    static int String_Search(String str, char target){
        if(str.length() == 0){
            return -1;
        }

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)){
                return index;
            }
        }
        return -1;
    }
}
