package Javaweek2ReHW;

/***
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme3 {
    String name = "Prime";
    static String surname = "Testing";

    public static void main(String[] args) {
        Programme3 programme3 = new Programme3();
        programme3.instanceMethod();
        staticMethod();
    }
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Programme3.surname);

    }
    public static void staticMethod() {
        Programme3 programme_3 = new Programme3();
        System.out.println(programme_3.name);
        System.out.println(surname);
    }

}

