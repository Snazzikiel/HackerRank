import java.io.*;
import java.util.*;

public class Solution {


    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        } else if (n == 2){
            return true;
        }

        //int squareTime = (int)Math.sqrt(n);
        //for (int i = 2; i <= squareTime; i++){
        // OR 
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (isPrime(arr[i])){
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}

