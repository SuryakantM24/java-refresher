package Arrays;

import java.util.Scanner;

public class preFixSum {


    public static int  getPreFixSum(int [] arr,int start,int end){


        int [] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        return start==0?prefix[end]:prefix[end]-prefix[start];


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int start=s.nextInt();
        int end=s.nextInt();

        int res =getPreFixSum(arr,start,end);
        System.out.println(res);
    }

}


/*
                   0  1  2 3 4 5 6
                   2   8  3 9 6 5 4

                   2  10 13 22 28 33 37
                   i

get(0,2)= 11
get(1,3)= 20

 */

// TOD0:- Weighted prefix sum



