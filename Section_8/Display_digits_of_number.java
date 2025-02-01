package Section_8;

import java.util.Scanner;
public class Display_digits_of_number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number whoose sum of digits you want to find : ");
        int num = sc.nextInt();

        int sum = 0;
        while (num / 10 > 0) {
            sum = sum + num%10;
            num = num/10;
        }
        sum = sum + num;
        System.out.println("The sum of the digits of the numbers is : " + sum);

        System.out.println();
        System.out.println("Now enter the number whoose digits you want to find out : ");
        int nums = sc.nextInt();

        while (nums >= 10) {
            System.out.print(nums%10 + ", ");
            nums = nums/10;
        }
        System.out.println(nums + " \n");
        sc.close();
    }
}
