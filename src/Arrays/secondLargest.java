package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class secondLargest {


    public static ArrayList<Integer> secondLarge(int[] arr){

        ArrayList<Integer> list= new ArrayList<>();

        int largest= arr[0];
        int second=-1;

        for(int i=1;i<arr.length;i++) {

            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        list.add(largest);
        list.add(second);
        return list;
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        ArrayList<Integer> res=secondLarge(arr);
        for(int x:res){
            System.out.print(x+" ");
        }
    }

}
