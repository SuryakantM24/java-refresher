package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeaders {

    public static ArrayList<Integer> Leaders(int [] arr){

        ArrayList<Integer> res=new ArrayList<>();
        int i=arr.length-2;
        res.add(0,arr[i+1]);
        while(i>=0){
            if(arr[i]>= res.get(0))
            {
                res.add(0,arr[i]);
            }
            i--;
        }
        return res;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        ArrayList<Integer> res= Leaders(arr);
        for(int x: res){
            System.out.println(x+" ");
        }
    }
}

