import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String sIn = scan.nextLine();

        while(scan.hasNextLine() && !((sIn = scan.nextLine()).equals(""))){
            String odd = "";
            String even = "";

            for (int i = 0; i < sIn.length(); i++){
                if (i%2 == 0){
                    even += sIn.charAt(i);
                } else {
                    odd += sIn.charAt(i);
                }
            }
            System.out.println(even + " " + odd);
        }

    }
}

