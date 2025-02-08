package Arrays;

import java.util.Scanner;

public class LongestEvenOdd {


    public static  int evenOddLong(int[] arr){

        int res=1;
        int curr=1;

        for(int i=1;i<arr.length;i++){

            if((arr[i]%2==0&&arr[i-1]%2!=0 )|| (arr[i]%2!=0 && arr[i-1]%2==0)){
                curr+=1;

            }
            else{
                curr=1;
            }
            res=Math.max(res,curr);
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
        int res=evenOddLong(arr);
        System.out.println(res);
    }
}

/*

  10 12 14 7 8
             i

  curr =3
  res=3

 */


