// Practicing the Try and Catch block in java Exception handling section

package Section_18_Exception_Handling;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // using the try and Catch Block
        try {

            System.out.print("Please enter the value of a: ");
            int a = sc.nextInt();

            System.out.print("Enter the value of b: ");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("The division of two numbers is " + c);

        } catch (ArithmeticException e) {

            // TODO: handle exception
            System.out.println("Denominator cannot be Zero " + e);
        }
        System.out.println("bye");
        sc.close();
    }
}
