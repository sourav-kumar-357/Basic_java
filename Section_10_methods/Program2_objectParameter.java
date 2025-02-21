package Section_10_methods;

import java.util.Scanner;

public class Program2_objectParameter {

    static Scanner sc = new Scanner(System.in);

    static void change(int[] arr) {
        System.out.print("Enter the value you want to change : ");
        int num = sc.nextInt();
        System.out.print("What is the new value you want : ");
        int newNum = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                arr[i] = newNum;
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Please enter the total number of element in the array : ");
        int element = sc.nextInt();

        int[] arr = new int[element];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Please enter the " + (i + 1) + " element of the array : ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.print("\nThe array is as follow : ");
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }

        change(arr);
        System.out.print("\nThe new array is : ");
        for (int A : arr) {
            System.out.print(A + " ");
        }
    }
}
