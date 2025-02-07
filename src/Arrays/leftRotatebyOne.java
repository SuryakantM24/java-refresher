package Arrays;

import java.util.Scanner;


   /*
    Given an array arr, rotate the array by one position in clockwise direction.

    Examples:

    Input: arr[] = [1, 2, 3, 4, 5]
    Output: [5, 1, 2, 3, 4]
    Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
    Input: arr[] = [9, 8, 7, 6, 4, 2, 1, 3]
    Output: [3, 9, 8, 7, 6, 4, 2, 1]
    Explanation: After rotating clock-wise 3 comes in first position.  */

public class leftRotatebyOne {




   public static void leftRotateOne(int [] arr){

       int n=arr.length-1;
       int  temp=arr[n];
       for(int i=n;i>0;i--){

           arr[i]=arr[i-1];

       }
       arr[0]=temp;

   }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
         leftRotateOne(arr);

        for (int j : arr) {
            System.out.print(j + " ");

        }
    }
}

