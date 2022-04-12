package javaWithElifH;

import java.util.Arrays;

public class ForEachLoopsString {
    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop
    public static void main(String[] args) {
        System.out.println( " Solution of part 1 ");
        String list[]={"fruits", "vegetables", "meat", "milk"};
        for (String n:list
             ) {
            System.out.print(n+", " );

        }
        System.out.println("");
        for (String l :list
             ) {
            System.out.print("Lengt of " +"\""+l+"\""+" is "+l.length()+". " );

        }


        System.out.println( " Solution of part 2 ");
        for (String e:list
             ) {
            System.out.print(e+", ");
            if (e.startsWith("v"))
                break;

        }

    }
}
