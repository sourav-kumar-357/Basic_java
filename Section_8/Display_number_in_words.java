package Section_8;

import java.util.Scanner;

public class Display_number_in_words {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int num = sc.nextInt();
        int abc = num;

        int newnum = 0;
        while (num >= 10) {
            newnum = (newnum * 10) + (num % 10);
            num /= 10;
        }
        newnum = (newnum * 10) + (num % 10);

        int actual = 0;
        while (newnum > 0) {
            actual = (newnum % 10);
            switch (actual) {
                case  0 : System.out.print("Zero" + " ");
                    break;
                case  1 : System.out.print("One" + " ");
                    break;
                case  2 : System.out.print("Two" + " ");
                    break;
                case  3 : System.out.print("Three" + " ");
                    break;
                case  4 : System.out.print("Four" + " ");
                    break;
                case  5 : System.out.print("Five" + " ");
                    break;
                case  6 : System.out.print("Six" + " ");
                    break;
                case  7 : System.out.print("Seven" + " ");
                    break;
                case  8 : System.out.print("Eight" + " ");
                    break;
                case  9 : System.out.print("Nine" + " ");
                    break;
                
                default: System.out.println("Invalid number");
                    break;
            }
            newnum /= 10;
        }
        while (abc % 10 == 0) {
            System.out.print("Zero" + " ");
            abc /= 10;
        }
        sc.close();
    }
}
