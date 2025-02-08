package Arrays;

import java.util.Scanner;

public class maxConsecutiveOnes {

    public static int MaxOnes(int [] arr){

        int count=0;
        int max=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==1){
                count++;
                max=Math.max(count,max);
            }
            else{
                count=0;
            }
        }
        return  max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int Trp=MaxOnes(arr);
        System.out.println(Trp);
    }

}


/*

max=2;
count =0

0 1 1 0 1 0

max=4;
c=2

1 0 1 1 1 1 0 1 1
                i
 */