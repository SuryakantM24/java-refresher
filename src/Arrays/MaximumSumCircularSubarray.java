package Arrays;

import java.util.Scanner;

public class MaximumSumCircularSubarray {



    public static int MaximumCircularSum(int [] arr){
        int cmax=arr[0];
        int omax=arr[0];
        int cmin=arr[0];
        int omin=arr[0];
        int sum=arr[0];

        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            cmax=Math.max(cmax+arr[i],arr[i]);
            omax=Math.max(omax,cmax);
            cmin=Math.min(cmin+arr[i],arr[i]);
            omin=Math.min(omin,cmin);

        }
        return sum-omin==0?omax:sum-omin;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int res= MaximumCircularSum(arr);
        System.out.println(res);
    }


}

/*

[3, -4, 2, -5, 1, -3, 4, 0]
                   i
        -9

cmin -9
omin -9
cmax  -3
omax  3
*/

/*
 total-inverse Kadane
 if(total-inverse kadane) ==0 (all element are negative) then overall max
 */