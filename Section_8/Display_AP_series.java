package Section_8;

import java.util.Scanner;

public class Display_AP_series {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first term of the series : ");
        int first = sc.nextInt();
        System.out.print("Now please enter the common difference here : ");
        int diff = sc.nextInt();
        System.out.print("Please enter the last digit upto which you want to display the numbers : ");
        int last = sc.nextInt();

        int num = first;
        while (num <= last) {
            System.out.print(num + " ");
            num = num + diff;
        }
        sc.close();
    }
}
