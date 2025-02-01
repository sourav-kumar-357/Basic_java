package Section_8;

import java.util.Scanner;

public class Display_GP_series {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number of the series: ");
        int first = sc.nextInt();
        System.out.print("Please enter the value of ratio: ");
        int ratio = sc.nextInt();
        System.out.print("How many such elements do you want in the series: ");
        int terms = sc.nextInt();

        int i = 1;
        while (i <= terms) {
            System.out.print(first + " ");
            i++;
            first = first * ratio;
        }
        sc.close();
    }
}
