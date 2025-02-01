package Section_5;

import java.util.Scanner;
public class Cuboid_challenge {
    
    public static void main(String[] args) {

        // we are gonna calculate the total surface area and the volume of a cuboid by taking the length and width and height as inputs 

        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter the length, width and height of the cuboid : ");

        float length = sc.nextFloat();
        float width = sc.nextFloat();
        float height = sc.nextFloat();

        area(length, width, height);
        volume(length, width, height);

        sc.close();

    }

    public static void area(float length, float width, float height) {

        // calculating the area of teh cuboid by the formula

        double area = 2 * ((length*height) + (length*width) + (width*height));
        System.out.println("\nThe total surface area of the cuboid is : " + area + " Square units\n");

    }

    public static void volume(float length, float width, float height) {

        // calculating the volume of the cuboid by the formula of (l * b * h)

        double volume = (length * width * height);
        System.out.println("The volume of the cuboid is : " + volume + " Cubic units\n");
    }
}
