package Section_8;

import java.util.Scanner;

public class Reverse_numbers {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number whoose digits you want to reverse : ");
        long num = sc.nextInt();
        System.out.print("The reversed number is : ");

        while (num >= 10) {
            System.out.print(num%10);
            num /= 10;
        }
        System.out.println(num);

        sc.close();
    }
}
