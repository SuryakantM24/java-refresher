package Arrays;

import java.util.Scanner;

public class maximumDifference {


    public static int maxDiff(int [] arr){

        int min=arr[0];
        int maxDiff=arr[1]-arr[0];

        for(int i=2;i< arr.length;i++){
            maxDiff=Math.max(maxDiff,arr[i]-min);
            min=Math.min(min,arr[i]);
        }
        return maxDiff;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int res=maxDiff(arr);
        System.out.println(res);
    }
}

