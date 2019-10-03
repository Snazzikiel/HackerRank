import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] tmp;

        int tmpTime = 0;
        if (s.contains("AM")){
            s = s.replace("AM", "");
            tmp = s.split(":");
            if (tmp[0].equals("12")){
                tmp[0] = "00";
            }
        } else {
            s = s.replace("PM", "");
            tmp = s.split(":");
            if (!tmp[0].equals("12")){
                tmpTime = Integer.parseInt(tmp[0]);
                tmp[0] = String.valueOf(tmpTime + 12);
            }
        }
        
        return tmp[0] + ":" + tmp[1] + ":" + tmp[2];
    
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
