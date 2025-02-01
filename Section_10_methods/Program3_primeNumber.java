package Section_10_methods;

import java.util.Scanner;

public class Program3_primeNumber {

    static void primeNumber(int number) {
        for ( int i = 2; i < number; i++) {
            int num = number % i;
            if (num == 0) {
                System.out.println("The number is a composite number");
                return;
            }
        }
        System.out.println("The number is prime number ");
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number you want to check : ");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("Zero is niether prime nor composite ");
        } else if (number == 1 || number == -1) {
            System.out.println("The number is niether prime nor composite ");
        } else if (number == 2 || number == 2) {
            System.out.println("The number is a Prime number!");
        } else {
            primeNumber(number);
        }
        sc.close();
    }
}
