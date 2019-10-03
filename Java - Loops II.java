import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int tmp = 0;
            for (int x = 1; x <= n; x++){
                int p = a + (x * b) + tmp;
                tmp += (x * b) + tmp;
                System.out.print(p + " ");
            }
            //System.out.println(a + " " + b + " " + n);
            System.out.println();
        }
        in.close();
    }
}

