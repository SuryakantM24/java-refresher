package Arrays;

import java.util.Scanner;
//KADANE'S ALGO

public class maxSubarraySum {


    public static int maxSum(int [] arr){

        int csum=arr[0];
        int osum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(csum>=0){
                csum+=arr[i];
            }
            else{
                csum=arr[i];
            }

            osum=Math.max(csum,osum);
        }

        return osum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int res=maxSum(arr);
        System.out.println(res);
    }


}


/*
         i
 2 3 -8 7 -1 2 3

csum
osum   // naya element family me shamil hoga ya khud nayi family shamil karega wo csum pe depend kart hai.

  */