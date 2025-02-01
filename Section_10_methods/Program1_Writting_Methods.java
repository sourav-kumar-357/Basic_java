package Section_10_methods;

import java.util.Scanner;

public class Program1_Writting_Methods {

    static int great(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Please enter the value of b : ");
        int b = sc.nextInt();

        System.out.println("The greater number is : " + great(a, b));
        sc.close();
    }
}
