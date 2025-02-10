package Arrays;

import java.util.Scanner;

public class slidingWindow {


    public static int maxSumofSizeKwinDow(int [] arr,int k){
        int sum=0;

        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxSum=sum;
        for(int i=k;i<arr.length;i++){

            sum=sum+arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,sum);

        }
        return maxSum;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Array input complete.");
        int res=maxSumofSizeKwinDow(arr,4);
        System.out.println(res);


    }
}


/*
  1 8 30 -5 20 7

  54-1
  53>
  53

 */