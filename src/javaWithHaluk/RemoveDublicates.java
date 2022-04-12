package javaWithHaluk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveDublicates {
    /*
        Given int array

        remove the duplicated values from the array

        print non-duplicated array length

        for example:

        Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

//1 2 2 2 3 3 3 4 4 4 5 5 5
        result should be 5

        NOTE: while printing the result dont use for loop
        use System.out.println(Arrays.toString(your_array_name));
     */


    /*
       Verilen int array


       duplicated(tekrarlanan) öğeleri array den kaldır

      non-duplicated(tekrarlanmayan) öğe sayisini print et

       Örnek:

       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

       //1 2 2 2 3 3 3 4 4 4 5 5 5

       result  5 olmalı

       NOT: resultu print ederken for loop kullanmayın
       System.out.println(Arrays.toString(your_array_name));  kullanın
    */
    public static void main(String[] args) {



//        code start here
//        dont change anything before this line
//        your Array is useThisLine

        // Kodlamaya burdan başla.bu satırdan önceki satirlarda hicbirşeyi  degiştirme.
        //   useThisLine arrayini kullan

        int arr1[]={1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        List<Integer> arrl=new ArrayList<>();


            for (int i = 0; i < arr1.length; i++) {
                if (!arrl.contains(arr1[i]))
                    arrl.add(arr1[i]);

            }
           int tekrarlanmayan=arrl.size();
             int arrn[]=new int[tekrarlanmayan];
        for (int i = 0; i < arrn.length; i++) {
            arrn[i]=arrl.get(i);

        }

        System.out.println("Tekrarlanmayan Arrayin eleman syisi "+tekrarlanmayan+" dır. Arrayin elemanlari "+ Arrays.toString(arrn) );





    }
}

