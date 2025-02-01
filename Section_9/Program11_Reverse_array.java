package Section_9;

import java.util.Scanner;

public class Program11_Reverse_array {
    
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

        int[] newarr = new int[arr.length];
        int a = 0;
        int b = arr.length - 1;
        while (a < arr.length) {
            newarr[a] = arr[b];
            a++;
            b--;
        }

        System.out.print("The new array is : ");
        for ( int A : newarr ) {
            System.out.print(A + " ");
        }
        sc.close();
    }
}
