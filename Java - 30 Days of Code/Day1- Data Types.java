import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int varI = 0;
        double varD = 0.0;
        String varS = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        varI = scan.nextInt();
        varD = scan.nextDouble();
        varS = scan.nextLine();//blank space
        varS = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + varI);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + varD);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + varS);

        scan.close();
    }
}