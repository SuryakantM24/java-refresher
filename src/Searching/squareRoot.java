package Searching;

import java.util.Scanner;

public class squareRoot {


    public static int sqrt(int n){
        int start=1;
        int end=n;
        int sqrt=-1;
        while (start <= end) {
            int mid=(end+start)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                end=mid-1;

            }
            else{
                 start=mid+1;
                 sqrt=mid;

            }
        }
        return sqrt;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sqrt(n));

    }

}
