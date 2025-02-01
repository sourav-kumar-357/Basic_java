package Section_9;

import java.util.Scanner;

public class Program10_Deleting_element {
    
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

        System.out.print("Which element do you want to delete : ");
        int num = sc.nextInt();

        int count = 0;
        int a = 0;
        while (a < arr.length) {
            if (num == arr[a]) {
                count++;
            }
            a++;
        }

        if (count == 0) {
            System.out.print("The array doesnot have " + num + " to delete and the array is : ");
            for ( int A : arr) {
                System.out.print(A + " ");
            }
        } else {
            int[] myarr = new int[arr.length - count];
            int m = 0;
            int j = 0;
            while (j < arr.length) {
                if (num == arr[j]) {
                    j++;
                }
                myarr[m] = arr[j];
                m++;
                j++;
            }

            System.out.print("The new array is : ");
            for ( int A : myarr) {
                System.out.print(A + " ");
            }
        }
        sc.close();
    }
}
