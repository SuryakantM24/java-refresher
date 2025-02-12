package Searching;

import java.util.Scanner;

public class lastOccurance {

    public static int LastOccur(int[] arr,int key){

        int start=0;
        int end=arr.length-1;
        int occurance=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==key){
                occurance=mid;
                start=mid+1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return occurance;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        int res=LastOccur(array,key);
        System.out.println(res);
    }
}
