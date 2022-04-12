package javaWithElifH;

import java.util.Scanner;

public class Varargs_Q10 {
    static int toplam=0;
    // istedigimiz kadar sayi girdigimizde
    // toplamlari bize veren bir method yazalim...
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int sayi=1;
        while (sayi!=0){
            System.out.println("Enter number you want to sum. Enter '0' to finish.");
            sayi=scan.nextInt();

            toplamaMethodu(sayi);
        }



    }

    private static void toplamaMethodu(int...sayi) {
        for (int x:sayi
             ) {toplam+=x;

        }
        System.out.println(toplam);
    }

}
