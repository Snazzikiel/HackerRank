import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int bribes = 0;

        for (int i = q.length - 1; i > 0; i--) {
            if (q[i] != (i+1)){
                if (q[i-1] == (i+1)){
                    bribes++;
                    q[i-1] = q[i];
                    q[i] = (i+1);
                    
                } else if (q[i-2] == (i+1)){
                    bribes += 2;
                    q[i-2] = q[i-1];
                    q[i-1] = q[i];
                    q[i] = (i+1);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
                
            }
        }
        System.out.println(bribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
