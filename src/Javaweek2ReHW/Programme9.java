package Javaweek2ReHW;
/*
 * Write a program to convert the upper case to lower case.

 */

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the upper case string:");
        String uppercase=scanner.nextLine();
        System.out.println();
        Programme9 programme9=new Programme9();
        programme9.convertUppercaseToLowerCase(uppercase);

        scanner.close();
    }

        //Conversion of Uppercase to Lower case method
        public void convertUppercaseToLowerCase(String text) {
            System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
