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
        int count=0,bribes=0;
        boolean chaos=false;
        for(int i=0;i<q.length;i++){//System.out.println(i);
            int diff=q[i]-(i+1);
            if(diff>2){
                chaos=true;
                break;
            }
             for (int j = 0<(q[i]-2)?(q[i]-2):0; j < i; j++){
                if (q[j] > q[i]) 
                    bribes++;
            }
        }
        if(chaos){
            System.out.println("Too chaotic");
        }
        else{
        // for(int i=0;i< q.length;i++){
        //     for(int j=i+1;j<q.length;j++){
        //         if(q[i] > q[j]){ 
        //             int tmp=q[j];
        //             q[j]=q[i];
        //             q[i]=tmp;
        //             bribes++;
        //         }
        //     }
        // }
        System.out.println(bribes);
        }
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
