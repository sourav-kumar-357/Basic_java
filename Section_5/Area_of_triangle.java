package Section_5;

import java.util.Scanner;
public class Area_of_triangle {
    
    public static void main(String[] args) {
        
        // Calculating the area of the triangle by two ways

        part1();
        part2();
    }

    public static void part1() {

        // Taking base and height as inputs from the users and using the first method of calculating the area of the triangle

        Scanner sc = new Scanner(System.in);

        System.out.print("pleasee enter the length of the triangle : ");
        double base = sc.nextDouble();

        System.out.print("Please enter the height of the triangle : ");
        double height = sc.nextDouble();

        double area = (base*height)/2;

        System.out.println("The area of the triangle is : " + area + "\n");
        sc.close();
    }

    public static void part2() {

        // Taking all three sides as inputs from the user and then calculating the area 
        
        Scanner inputs = new Scanner(System.in);

        System.out.print("\nPlease enter the first side of the triangle : ");
        float first = inputs.nextFloat();

        System.out.print("Please enter the second side of the triangle : ");
        float second = inputs.nextFloat();

        System.out.print("Please enter the third side of the triangle : ");
        float third = inputs.nextFloat();

        double s = (first + second + third)/2;

        double a = s * (s - first) * (s - second) * (s - third);
        double area = Math.sqrt(a);

        System.out.println("The area of the triangle whoose sides are " + first + ", " + second + ", " + third + " is : " + area + " square units\n\n");
        inputs.close();
    }
}
