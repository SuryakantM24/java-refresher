package Arrays;

import java.util.Scanner;

public class subarrayWithGivenSum {


    public static boolean subarrayWithSum(int [] arr,int sum){
        int s=0;
        int j=0;

        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
            while(s>sum){
               s-=arr[j];
               j++;
            }

            if(s==sum){
                return true;
            }


        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int sumNeeded=s.nextInt();
        boolean res=subarrayWithSum(arr,sumNeeded);
        System.out.println(res);
    }
}

