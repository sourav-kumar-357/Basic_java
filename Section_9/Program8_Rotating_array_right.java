package Section_9;

import java.util.Scanner;

public class Program8_Rotating_array_right {
    
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

        int[] newArr = new int[arr.length];
        int a = 0;
        while (a < arr.length - 1) {
            newArr[a + 1] = arr[a];
            a++;
        }
        newArr[0] = arr[a];

        System.out.print("The new array is : ");
        for ( int A : newArr) {
            System.out.print(A + " ");
        }
        sc.close();
    }
}
