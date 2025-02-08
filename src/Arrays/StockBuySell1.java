package Arrays;

import java.util.Scanner;

public class StockBuySell1 {

    public static  int maxProfit(int [] arr) {

        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += (arr[i] - arr[i - 1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int maxproF=maxProfit(arr);
        System.out.println(maxproF);
    }
}

/*
1 5 3 8 12
           i
0+4+5+4=13


10 20 30 40

0+10+10+10


30 20 10

0+0+0




 */