package Section_11_OOPs_Concepts;

import java.util.Scanner;

class Rectangle {

    double length;
    double width;

    double area() {
        return (length * width);
    }

    double perimeter() {
        return (2*(length+width));
    }

    boolean isSquare() {
        return (length == width);
    }
}
public class Program2_RectangleClass {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        System.out.print("Enter the length of the rectngle: ");
        r1.length = sc.nextDouble();
        System.out.print("Enter the width of the rectngle: ");
        r1.width = sc.nextDouble();

        System.out.println("Area is: "+r1.area());
        System.out.println("Perimeter is: "+r1.perimeter());
        System.out.println(r1.isSquare() ? "Yes it is Square " : "Not a Square");
    }
}
