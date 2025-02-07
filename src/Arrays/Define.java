package Arrays;
import  java.util.*;

public class Define {


    public static void main(String[] args) {

        //In arrays elements are stored in continous locations
        //Random access
        // Cache Friendliness

        //fixed sized
        //Java arrays are memory allocated in Heap
        int arr[]=new int[10];

        arr[0]=1;
        arr[1]=2;
        System.out.println(arr[0]);
        //Dynamic size arrays (ArrayList)
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> a1=new ArrayList<>(10);//initial capacity
        al.add(10);//adds at then end of list
        al.add(1,2);
        for( int x : al){
            System.out.println(x);
        }

        //some important functions for arrays



    }
}
