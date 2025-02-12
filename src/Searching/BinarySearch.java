package Searching;
import java.util.Scanner;
public class BinarySearch {
/*
Binary Search is an efficient algorithm with a time complexity of O(log n), where n is the size of the sorted array. 
At each step, the algorithm reduces the search range by half, making it significantly faster compared to linear search.
 
 */

    public static boolean binarySearchRecursive(int[] arr, int key,int s,int e){

        if(s>e){
            return false;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==key){
            return true;
        }
        else if (arr[mid]<key){
           return binarySearchRecursive(arr,key,mid+1,e);
        }
        else{
            return binarySearchRecursive(arr,key,s,mid-1);
        }

    }
    public static boolean binarySearch(int[] arr,int key){

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        boolean res=binarySearch(array,key);
        boolean res1=binarySearchRecursive(array,key,0,array.length-1);
        System.out.println(res);
        System.out.println(res1);
    }
}
 /*6
10 20 30 40 50 60
50

 key 60

0   1  2 3  4  5   6
10 20 30 40 50 60 70
s                 e

mid=0+6/2=3
  */