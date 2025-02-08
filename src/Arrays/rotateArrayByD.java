package Arrays;

import java.util.Scanner;

public class rotateArrayByD {

    public  static void reverse(int [] arr,int start,int end) {
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int d=s.nextInt();

        // possibility is that  d>k so to make it in range
        // we take modulo d= d%k
        d=d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0, arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");

        }
    }
}

