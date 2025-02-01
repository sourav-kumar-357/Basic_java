package Section_8;

import java.util.Scanner;
public class Armstrong_number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number you wanted to check : ");
        int num = sc.nextInt();

        int sum = 0, newnum, num1;
        newnum = num;
        while (num > 10) {
            num1 = num % 10;
            sum = sum + (num1*num1*num1);
            num = num / 10;
        }
        sum = sum + (num*num*num);

        if (sum == newnum) {
            System.out.println("Yes it is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
        sc.close();

        // write the code for the Armstrong number
        
        
    }
}
