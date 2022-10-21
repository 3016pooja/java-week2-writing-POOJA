package Javaweek2ReHW;
/*Write a Java program to swap two variables.

 */

import java.util.Scanner;

public class Programme15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first  variable value :");
        int first = scanner.nextInt();
        System.out.println("Enter a second  variable value :");
        int second = scanner.nextInt();
        Programme15 programme15=new Programme15();
        programme15.swapTheValue(first,second);
    }

    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);
    }
}
