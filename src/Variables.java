//import java.util.Scanner;
import java.util.*;
public class Variables {


    public static  void main(String[] args){
        //
        int age=37;
        String name="Suryakant";
        float weight= 70.5f;
        System.out.println(age);
        System.out.println(name);
        System.out.println(weight);

       // Java is statically typed language

        //Data types

        //Primitive

        //Boolean
        boolean on= true; //1 bit

        // Integer numbers
        byte x=127; //1 byte   -127 to 127 or ( -2^7 to 2^-1)

        short a = 256; // 2 byte

        int v =1000; // 4 byte

        long l= 999999999; // 8 bytes


        // floating point numbers
        // float
        float ft= 2.5f; // explicitly mention f for float , 4 bytes
                        // by default decimal numbers are double in java

        // double
        double db= 3.14353; // 8 byte

        //character

        char cr= 'A'; // 2bytes (16 bit to include uni-code characters

        //NON Primitives
        Point p1=new Point();
        p1.x=30;
        p1.y=45;
        System.out.println(p1.x+" "+p1.y);
        Point p2=p1;

        p2.x=50;
        System.out.println(p1.x+" "+p1.y);




        //Primitives are stored in stack memory
        //Non Primitives are stored in heap memory


        //objects
        //etc


        //for every primitive type there is non-primitive wrapper class

        /*
          char  ---> Character
          byte  ---> Byte
          short ---> Short
          int   ---> Integer
          long  ---> Long
          float ---> Float
          double---> Double
          boolean--> Boolean
         */

        // Collections does not support primitive types so wrapper classes are there
        // primitve types are there due to c++ legacy,simplicity and efficiency

      //    Autoboxing and unboxing
          int z=10;

          Integer y=z; //Autoboxing

          Integer m=25;
           int m2=m; //Unboxing

        System.out.println(y);
        System.out.println(m2);

     // Type Conversion
        // implicit conversion
          // byte> short>int>long>float>double
         //default


        //explicit

        int s=35;
        byte b= (byte)s;

    // Read input

        Scanner sc=new Scanner(System.in);
        int mp=sc.nextInt();
        System.out.println(mp);

        // output

        System.out.println("abc"); //new line
        System.out.print("Abc");

        int d=32;
        System.out.format("Value of d is %d ",d);

        //command line arguments










    }
}

