package Arrays;

import java.util.Scanner;

public class removeDuplicates {

    //no extra space , no hashmap should be used

    public static  int removeDuplicates(int [] arr){

        int res=1;// includes 1st element

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                int temp=arr[i];
                arr[i]=arr[res];
                arr[res]=temp;
                res++;

            }

        }
        return res;
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int x=removeDuplicates(arr);
        System.out.println("x is "+ x);
        for(int i=0;i<x;i++){
            System.out.println(arr[i]);
        }
    }
}
/*
    i
1 2 3 4 3 3 4 5 5 6  7   7  8 9   9  9
  r
0 1 2 3 4 5 6 7 8 9  10 11 12 13 14 15


 */