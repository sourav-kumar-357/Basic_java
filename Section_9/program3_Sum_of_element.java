package Section_9;

import java.util.Scanner;

public class program3_Sum_of_element {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the total number of element in the array : ");
        int element = sc.nextInt();

        int[] arr = new int[element];
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            System.out.print("Please enter the " + (i + 1) + " element of the array : ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            i++;
        }
        sc.close();
        System.out.print("The sum of the element of array is : " + sum );

    }
}
