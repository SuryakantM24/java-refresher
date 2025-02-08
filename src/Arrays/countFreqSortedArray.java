package Arrays;

import java.util.Scanner;

public class countFreqSortedArray {


    public  static void sortedFreq(int [] arr){

        int curr=arr[0];
        int count=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=curr){
                System.out.println(curr+" "+count);
                count=1;
                curr=arr[i];
            }
            else{
                count++;
            }
        }
        System.out.println(curr+" "+count);

    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        sortedFreq(arr);
    }

}


/*
c=1
curr=30

10 10  10 25 30 30
                 i

10  3
25  1
=-------

c=3;
curr=10

10 10 10
         i

c=1  ,   1  ,1
curr=10 ,20,30


10 20 30
          i
10 1
20 1

10 20 30 30 30 30


*/


