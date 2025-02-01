package Section_10_methods;

import java.util.Scanner;

public class Program7_reverseArray_Int {
    
    // Reverse an array or an Integer
    static Scanner scanner = new Scanner(System.in);

    static void reverseArray(int[] arr) {
        int[] newarr = new int[arr.length];
        int a = 0, b = ( arr.length - 1 );
        while (a < newarr.length) {
            newarr[a] = arr[b];
            a++;
            b--;
        }
        System.out.print("The reverse of entered array is : ");
        for ( int A : newarr ) {
            System.out.print(A + " ");
        }
    }

    static void reverseInt(int num) {
        System.out.print("The reverse of the number is : ");
        while (num > 0) {
            System.out.print(num%10);
            num /= 10;
        }
    }
    public static void main(String[] args) {

        System.out.print("What do you want to reverse (array, integer, both) : ");
        String str = scanner.nextLine();

        if (str == "array") {
            System.out.print("Please enter the total number of element in the array : ");
            int num = scanner.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < arr.length; i++) {
               System.out.print("Enter the element number " + (i + 1));
              arr[i] = scanner.nextInt();
            }
            reverseArray(arr);
        } 
        
        else if (str == "integer") {
            System.out.print("Please enter the number you want to reverse : ");
            int num = scanner.nextInt();
            reverseInt(num);
        } 
        
        else {
            System.out.print("Please enter the total number of element in the array : ");
            int num = scanner.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < arr.length; i++) {
               System.out.print("Enter the element number " + (i + 1));
              arr[i] = scanner.nextInt();
            }
            reverseArray(arr);

            System.out.print("Please enter the number you want to reverse : ");
            int nums = scanner.nextInt();
            reverseInt(nums);
        }
    }
}
