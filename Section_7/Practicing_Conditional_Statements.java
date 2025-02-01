package Section_7;

import java.util.Scanner;
public class Practicing_Conditional_Statements {
    
    public static void main(String[] args) {
        
        positive_negative();
        greater_among_three();
        
    }

    public static void positive_negative() {

        // if the number is greater than 0 then it's positive else it's negative
        
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("the number is positive ");
        } else {
            System.out.println("the number you just entered is negative ");
        }
        sc.close();
    }

    public static void greater_among_three() {

        // We want to print the gretest among the three numbers that should be taken as input from the user

        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("Please enter the value of b : ");
        int b = sc.nextInt();

        System.out.print("Please enter the value of c : ");
        int c = sc.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println("The greaest number is " + a);
        } else {
            if (b > c) {
                System.out.println("The greaest number is " + b);
            } else {
                System.out.println("the greatest number is " + c);
            }
        }

        sc.close();
    }
}
