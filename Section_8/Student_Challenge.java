package Section_8;

import java.util.Scanner;
public class Student_Challenge {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Display the multiplication table of a number
        System.out.println("Please enter the number for which you want to display the multiplication table: ");
        int number = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }

        // Display the sum of n natural numbers
        System.out.println("Please enter the number for which you want to display the sum of n natural numbers: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        // Display the factorial of a number
        System.out.println("Please enter the number for which you want to display the factorial: ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int a = 1; a <= num; a++) {
            factorial = factorial * a;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);

        sc.close();
    }
}
