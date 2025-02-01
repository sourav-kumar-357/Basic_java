package Section_8;

import java.util.Scanner;
public class Counting_digits_of_number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        long num = sc.nextLong();

        int count = 0;
        while (num > 10) {
            count ++;
            num /= 10;
        }
        System.out.println("The total number of digits in the number is : " + ++count );
        sc.close();
    }
}
