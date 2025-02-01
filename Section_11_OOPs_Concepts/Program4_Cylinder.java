package Section_11_OOPs_Concepts;

import java.util.Scanner;

class Cylinder {
    private double radius, height;

    public Cylinder() {
        this.radius = 10;
        this.height = 20;
    }

    public Cylinder(double r, double h) {
        setRadius(r);
        setHeight(h);
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("The height cannot be negative and is set to 0");
            this.height = 0;
        }
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("The radius cannot be negative and is set to 0");
            this.radius = 0;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return 2 * Math.PI * getRadius() * (getHeight() + getRadius());
    }

    public double volume() {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }
}

public class Program4_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you want to enter value of height and radius? (Yes or No): ");
        String response = sc.nextLine().trim();

        Cylinder c1;
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter the value of radius: ");
            double radius = sc.nextDouble();
            System.out.print("Enter the value of height: ");
            double height = sc.nextDouble();
            c1 = new Cylinder(radius, height);
        } else {
            c1 = new Cylinder();
        }

        System.out.printf("The area of Cylinder with radius %.2f and height %.2f is %.2f%n", 
                          c1.getRadius(), c1.getHeight(), c1.area());
        System.out.printf("The volume of Cylinder with radius %.2f and height %.2f is %.2f%n", 
                          c1.getRadius(), c1.getHeight(), c1.volume());
        sc.close();
    }
}
