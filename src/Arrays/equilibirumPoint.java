package Arrays;

import java.util.Scanner;

public class equilibirumPoint {



    public static boolean getEquilibriumPointNoExtraSpace(int [] arr){

        int rsum=0;
        for(int i=0;i<arr.length;i++){
            rsum=arr[i]+rsum;
        }
        int lsum=0;
        for(int i=0;i<arr.length;i++){
            rsum=rsum-arr[i];
            if(lsum==rsum) {
                return true;
            }
            lsum=lsum+arr[i];
        }
        return false;
    }
    /*
     1 2 0 3

     6

     */

    public static boolean equilibirum(int [] arr){

        int [] lsum=new int[arr.length];
        int [] rsum=new int[arr.length];
        lsum[0]=0;
        for(int i=1;i<arr.length;i++){
            lsum[i]=lsum[i-1]+arr[i-1];
        }
        rsum[arr.length-1]=0;
        for(int i=arr.length-2;i>=0;i--){
            rsum[i]=rsum[i+1]+arr[i+1];
        }

        for(int i=0;i<arr.length;i++){
            if(lsum[i]==rsum[i]){
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
        boolean res=equilibirum(arr);
        System.out.println(res);
    }
}


/*
 1 2 0 3




sum=6
 */
