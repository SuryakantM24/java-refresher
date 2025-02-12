package Searching;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class countOnes {

    public  static int firstOccurance(int[] arr) {

        int start = 0;
        int key=1;
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
        return occurance==-1?0:arr.length-occurance;
    }
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }

        int count=firstOccurance(array);
        System.out.println(count);
    }
}


