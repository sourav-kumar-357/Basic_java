package Section_8;

import java.util.Scanner;

public class Fibonacci_series {

    public static void main(String[] args) {
        
        // We have to print the Fibonacci series upto 10 numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of terms you want : ");
        int terms = sc.nextInt();

        int num1 = 0;
        System.out.print(num1 + " ");
        int num2 = 1;
        System.out.print(num2);
        int num3;
        while ((terms - 2) > 0) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
            terms--;
        }
        sc.close();
    }
}