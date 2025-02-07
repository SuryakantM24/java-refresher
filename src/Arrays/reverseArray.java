package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseArray {


    public static void reverse(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        reverse(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
