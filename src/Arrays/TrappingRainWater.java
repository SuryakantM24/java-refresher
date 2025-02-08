package Arrays;

import java.util.Scanner;

public class TrappingRainWater {


    public static int Trapped(int[] arr){

        int n=arr.length;
        int [] left=new int[n];
        int [] right=new int[n];
        left[0]=arr[0];
        right[n-1]=arr[n-1];

        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }

        int trapped=0;

        for(int i=0;i<n;i++){
            trapped+=Math.min(left[i],right[i])-arr[i];
        }
        return trapped;



    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int Trp=Trapped(arr);
        System.out.println(Trp);
    }
}




/*


   3    0   4   0   2   5

   3    3   4   4   4   5   leftmax

   5   5    5   5   5   5    rightmax

   0  + 3+ 0+ 4+2+0= 9 units


 */