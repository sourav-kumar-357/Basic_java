package Section_10_methods;

import java.util.Scanner;

public class Program5_MaximumElementInArray {

    static int maximum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the total number of element in the array you want : ");
        int index = sc.nextInt();
        int[] arr = new int[index];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of index " + ( i + 1 ) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The maximum of the array is : " + maximum(arr));
        sc.close();
    }
}
