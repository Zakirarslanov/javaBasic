package javaWithElifH;

import java.util.Scanner;



public class Varargs_Q11 {
    static double d=1.0;
    static Scanner scan=new Scanner(System.in);
    static double total=1;

    // Create a multiply method with double varargs (return double)
    public static void main(String[] args) {



        System.out.println(multiply());
    }

    public static double multiply() {
        while (d!=0) {

            System.out.println("Enter numbers you want to multiply. Press '0' to finish ");
            double d = scan.nextDouble();
            if (d==0) break;
            total *= d;
            System.out.println(total);
        }
        return total;
    }


}
