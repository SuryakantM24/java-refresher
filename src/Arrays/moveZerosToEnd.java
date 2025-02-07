package Arrays;

import java.util.Scanner;

public class moveZerosToEnd {
    //relative order of non-zero numbers should be preserved


    public  static int[] moveZeros(int [] arr){

        int non=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[non];
                arr[non]=temp;
                non++;
            }

        }

        return arr;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int []x= moveZeros(arr);

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");

        }
    }

}

/*

                            i
1 2 3 4 5 3 6 9 0 0 0 0 0 0
                n

                   i
1 3 4 5 0 0 0 0 0 0
      n


*/