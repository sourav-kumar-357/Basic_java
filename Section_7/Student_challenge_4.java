package Section_7;

import java.util.Scanner;
public class Student_challenge_4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        String nums = sc.nextLine();
        radix(nums);

        System.out.print("Please enter the year : ");
        int year = sc.nextInt();
        leap_year(year);

        sc.close();
    }

    public static void radix(String nums) {

        // Find out the radix of a given number weather it is Binary, Octal, Hexa or Decimal

        if (nums.matches("[01]+")) {

            System.out.println("Binary Radix = 2");

        } else if (nums.matches("[0-7]+")) {

            System.out.println("Octal Radix = 8");

        } else if (nums.matches("[0-9]+")) {

            System.out.println("Decimal Radix = 10");
            
        } else if (nums.matches("[0-9A-F]+")) {

            System.out.println("Hexa Radix = 16");
            
        } else {
            System.out.println("Not a number");
        }
    }

    public static void leap_year(int year) {

        // We have to find out if the Year is a leap year or not and for doing this we need to devide the number by 4

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not Leap year");
        }
    }
}
