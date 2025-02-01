package Section_7;

import java.util.Scanner;
public class Student_challenge_3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number which you wanna check : ");
        int a = sc.nextInt();
        odd_even(a);

        System.out.print("Please enter the age of the user : ");
        int age = sc.nextInt();
        young(age);

        System.out.print("please enter the total marks scored in top 5 subjects : ");
        float marks = sc.nextFloat();
        Grades(marks);

        sc.close();
    }

    public static void odd_even(int a) {

        // check weather a number is odd or even 
        // if it's divisible by 2

        if (a % 2 == 0) {
            System.out.println("The number you just entered is even ");
        } else {
            System.out.println("the number you entered is odd");
        }
    }

    public static void young(int age) {

        // If a person is greater than 18 years then it is young

        if (age > 18) {
            System.out.println("You are young person ");
        } else {
            System.out.println("You are not young ");
        }
    }

    public static void Grades(float marks) {

        // Giving the grades on the basis of marks 

        float percentage = marks/5;

        if (percentage > 90) {
            System.out.println("A+");
        } else {
            if (percentage > 80) {
                System.out.println("A");
            } else {
                if (percentage > 60) {
                    System.out.println("B");
                } else {
                    if (percentage > 40) {
                        System.out.println("C");
                    } else {
                        System.out.println("D");
                    }
                }
            }
        }
    }
}
