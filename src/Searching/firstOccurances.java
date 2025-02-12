package Searching;

import java.util.Scanner;

public class firstOccurances {

    public  static int firstOccurance(int[] arr,int key){

        int start=0;
        int end=arr.length-1;
        int occurance=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                occurance=mid;
                end=mid-1;
            }
            else if (arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        } return occurance;


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        int res=firstOccurance(array,key);
        System.out.println(res);
    }


}
/*
13
1 3 4 5 6 7 8 10 10 10  20 20 40
0 1 2 3 4 5 6 7  8   9  10 11 12
s                             e
           mid

 */

