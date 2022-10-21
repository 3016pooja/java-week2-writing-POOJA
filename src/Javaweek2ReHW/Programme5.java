package Javaweek2ReHW;
/*Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)

 */

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a first number:");
        int a=scanner.nextInt();
        System.out.println("enter a second number:");
        int b=scanner.nextInt();

        Programme5 programme5=new Programme5();
        programme5.multiplication(a,b);

        Programme5 programme51=new Programme5();
        programme51.division(a,b);

        addition(a,b);
        substration(a,b);
    }
    public static void addition(int a,int b){
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is : " + result);
    }
    public static void substration(int a,int b){
        int result=a-b;
        System.out.println("the substration of" +a+ "and" + b+ "is :"+result);
    }
    public void multiplication(int a,int b){
        int result=a*b;
        System.out.println("the multiplication of" +a+ "and" + b+ "is :"+result);
    }
    public int division (int a, int b){
        return a/b;

    }
}
