import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int totalSwaps = 0;
        // Write Your Code Here
        for (int i = 0; i < n; i++) {

            int numberOfSwaps = 0;
            
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    numberOfSwaps++;
                    totalSwaps++;
                }
            }
            
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length -1]);
    }
}

