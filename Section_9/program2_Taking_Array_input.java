package Section_9;

import java.util.Scanner;

public class program2_Taking_Array_input {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the total number of element in the array : ");
        int element = sc.nextInt();

        int[] arr = new int[element];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Please enter the " + (i + 1) + " element of the array : ");
            arr[i] = sc.nextInt();
            i++;
        }
        sc.close();

        System.out.println("\nThe array is as follow : ");
        for ( int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}
