package Arrays;

import java.util.Scanner;

public class minimumConsecutiveFlips {



    public static void minFlips(int [] arr){

        for(int i=1;i<arr.length;i++) {
            if(arr[i]!=arr[i-1]){ // start of new group

                if(arr[i]!=arr[0]){  //to check if its different from starting group
                    System.out.print("from "+i+" to ");

                }else{
                    System.out.println(i-1);
                }
            }
        }
        if(arr[arr.length-1]!=arr[0]){
            System.out.println(" to "+ (arr.length-1) );
        }

    }




    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        minFlips(arr);


    }
}

/*

0 0 1 1 0 0 1 1 0

 */