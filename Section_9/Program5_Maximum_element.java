package Section_9;

import java.util.Scanner;

public class Program5_Maximum_element {
    
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

        int max = 0;
        int a = 0;
        while (a < arr.length) {
            if (max < arr[a]) {
                max = arr[a];
            }
            a++;
        }
        System.out.print("The maximum of all the elements is : " + max);
        sc.close();
    }
}
