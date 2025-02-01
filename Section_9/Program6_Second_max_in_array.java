package Section_9;

import java.util.Scanner;

public class Program6_Second_max_in_array {
    
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

        int a = 0;
        int second = arr[a];
        int max = arr[a + 1];
        while (a < arr.length) {
            if (max < arr[a]) {
                second = max;
                max = arr[a];
            }
            a++;
        }

        System.out.println("The second largest number in th earray is : " + second);
        sc.close();
    }
}
