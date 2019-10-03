import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        int[] freq = new int[26];
        boolean decision = false;
        int letCount = 0;

        for (int f = 0; f < freq.length; f++){
            freq[f] = 0;
        }

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        
        letCount = freq[s.charAt(0) - 'a'];

        for (int i = 0; i < freq.length; i++){
            if (freq[i] != 0){
                if (freq[i] - letCount != 0){
                    if (decision == false){
                        decision = true;
                    } else {
                        return "NO";
                    }
                }
            }
        }

        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
