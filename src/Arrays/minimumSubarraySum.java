package Arrays;

import java.util.Calendar;
import java.util.Scanner;

public class minimumSubarraySum {


    public static int MinSubarraySum(int [] arr){

        int cmin=arr[0];
        int omin=arr[0];

        for(int i=1;i<arr.length;i++){
            if(cmin<0) {
                cmin += arr[i];
            }
            else {
                cmin=arr[i];
            }
            omin=Math.min(omin,cmin);
        }
        return omin;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int res= MinSubarraySum(arr);
        System.out.println(res);
    }
}

/*

c=-2

o=-6

8 -4 3 -5 4
          i

*/