import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binNumber = Integer.toBinaryString(n);
        int numberOnes = 0;
        int tempOnes = 0;

        for (int i = 0; i < binNumber.length(); i++){
            int chr = (int)binNumber.charAt(i);
            if ((chr % 2) == 1){
                tempOnes++;
            } else {
                tempOnes = 0;
            }
            numberOnes = Math.max(numberOnes, tempOnes);
        }

        System.out.println(numberOnes);
        scanner.close();
    }
}
