package Section_10_methods;

import java.util.Scanner;

public class Program4_GCDofTwoNumbers {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.print("Please enter the number 1 : ");
        num1 = scanner.nextInt();
        System.out.print("Please enter the number 2 : ");
        num2 = scanner.nextInt();
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
        scanner.close();
    }
}
