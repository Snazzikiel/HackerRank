import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String sReturned = sc.nextLine();
        String sDue = sc.nextLine();

        String saRet[] = sReturned.split(" ");
        String saDue[] = sDue.split(" ");

        int iDaysOver = Integer.parseInt(saRet[0]) - Integer.parseInt(saDue[0]);
        int iMonthsOver = Integer.parseInt(saRet[1]) - Integer.parseInt(saDue[1]);
        int iYearsOver = Integer.parseInt(saRet[2]) - Integer.parseInt(saDue[2]);

        if (iYearsOver > 0){
            System.out.println(10000);
        } else if (iMonthsOver > 0 && iYearsOver == 0){
            System.out.println(500 * iMonthsOver);
        } else if (iDaysOver > 0 && iYearsOver == 0){
            System.out.println(15 * iDaysOver);
        } else {
            System.out.println(0);
        }
    }
}

