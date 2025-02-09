package Arrays;

import java.util.Scanner;

public class MajorityElement {

    public static int Majority(int [] nums){

        int count=1;
        int major=nums[0];
        for(int i=1;i<nums.length;i++){
            if (nums[i] == major) {
                count++;
            }
            else{
                count--;
                if(count==0){
                    major=nums[i];
                    count=1;
                }
            }
        }
        int num=0;
        for(int i=0;i<nums.length;i++){ if(nums[i]==major) num++;
        }
        if(num>nums.length/2) return major;
        else return -1;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int res=Majority(arr);
        System.out.println(res);

    }
}
/*

1 1 1 2 3 4
          i
c=0
m=4
 */