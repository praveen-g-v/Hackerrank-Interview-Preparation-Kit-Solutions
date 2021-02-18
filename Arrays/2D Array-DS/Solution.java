import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int a[]=new int[16];
        int q=0;
            for(int j=0;j<6;j=j+1){
                for(int k=0;k<6;k++){
                    int r=0,sum=0;
                    if(((k+3)<=6)&&(j<4)){
                        sum+=arr[j][k]+arr[j][k+1]+arr[j][k+2];
                        r++;
                    }
                    if(((j+1)<5)&&((k+1)<5)){
                        sum+=arr[j+1][k+1];
                        r++;
                    }
                    if(((k+3)<=6)&&(j+3)<=6){
                        sum+=arr[j+2][k]+arr[j+2][k+1]+arr[j+2][k+2];
                        r++;
                    }
                    if(r==3){
                       a[q]=sum;
                       q++;
                       r=0;
                       sum=0;  
                    }
                    
                }
            }
            Arrays.sort(a);
            System.out.println(a[15]);
            return a[15];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
