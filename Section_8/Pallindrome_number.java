package Section_8;

import java.util.Scanner;

public class Pallindrome_number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Write down the number which you want to check : ");
        long num = sc.nextLong();

        long num1 = num;
        long num2 = 0;
        while (num1 >= 10) {
            num2 = (num2*10) + (num1 % 10);
            num1 = num1 / 10;
        }
        num2 = (num2*10) + (num1 % 10);

        if (num2 == num) {
            System.out.println("The number you entered is a pallindrome number");
        } else {
            System.out.println("The number you entered is not a pallindrome number");
        }
        sc.close();
    }
}
