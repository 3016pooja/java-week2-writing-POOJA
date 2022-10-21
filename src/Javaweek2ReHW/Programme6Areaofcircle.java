package Javaweek2ReHW;
/* * Write a program to enter any radius value of the circle and find out the area.
(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Programme6Areaofcircle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a radius :");
        double radius=scanner.nextDouble();
        areaOfCircle(radius);
        scanner.close();


    }
    public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is : " + area);
    }
}
