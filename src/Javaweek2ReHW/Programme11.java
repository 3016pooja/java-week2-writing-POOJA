package Javaweek2ReHW;
/*Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a
 */

public class Programme11 {

    public static void main(String[] args) {
        Programme11 programme11=new Programme11();
        System.out.println("---------------------------------------------");
        programme11.Pattern();
    }

    // Printing the Java Pattern
    public void Pattern() {
        System.out.println("J  a  v   v a");
        System.out.println("J a a  v v a a");
        System.out.println("J J aaaaa  V V aaaaa");
        System.out.println("J J a   a  V a  a");

    }
}
