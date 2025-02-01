package Section_5;

import java.util.Scanner;
public class Roots_of_quadratic {
    
    public static void main(String[] args) {

        // We are gonna calculate the roots of a quadratic equation by the formula of (-b +- root(-b^2 + 4ac))/2a and to do this we need three variables and that is a, b and c 

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nOur quadratic equation is : ax^2 + bx + c (Where a, b and c are variables) \n");
        System.out.print("Please enter the value of a : ");
        float a = sc.nextFloat();
        System.out.print("Please enter the value of b : ");
        float b = sc.nextFloat();
        System.out.println("Please enter the value of c : ");
        float c = sc.nextFloat();

        System.out.println("\nWell! now the quadratic equation looks like : " +a+"x^2 + "+b+"x + "+c+"\n" );

        double r1 = ((-b) + Math.sqrt(-(b*b) + 4*a*c))/2*a;

        double r2 = ((-b) - Math.sqrt(-(b*b) + 4*a*c))/2*a;

        System.out.println("The roots of the quadratic equation are : \nRoot 1 : " + r1 + "\nRoot 2 : " + r2 + "\n");
        sc.close();
    }
}
