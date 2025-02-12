package Searching;

import java.util.Scanner;


public class countOccurences {

    public  static int firstOccurance(int[] arr,int key) {
        int start = 0;
        int end = arr.length - 1;
        int occurance = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                occurance = mid;
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return occurance;
    }
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
    public static int countOccurences(int[] arr,int key){

        int first=firstOccurance(arr,key);
        if(first==-1){
            return 0;
        }
        else return LastOccur(arr,key)-first+1;

    }
    public static void main (String [] args){
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            int key = scanner.nextInt();
            int res =countOccurences(array,key);
            System.out.println(res);
        }
}
