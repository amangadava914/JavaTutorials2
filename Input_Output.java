import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Input_Output {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        // Scanner br = new Scanner(System.in);
        // int N = br.nextInt();
        // String S = br.next();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        System.out.println(N*2);
        System.out.println(S);
    }
}
