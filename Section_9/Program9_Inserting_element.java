package Section_9;

import java.util.Scanner;

public class Program9_Inserting_element {
    
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

        System.out.print("Which element so you want to imsert : ");
        int num = sc.nextInt();
        System.out.print("Which index do you want to insert : ");
        int index = sc.nextInt();

        int a = 0;
        int b = 0;
        int[] newArr = new int[++i];

        while (a < newArr.length) {
            if (b == index) {
                newArr[a] = num;
                a++;
            }
            newArr[a] = arr[b];
            a++;
            b++;
        }

        System.out.print("The new array is : ");
        for ( int A : newArr ) {
            System.out.print(A + " ");
        }
        sc.close();
    }
}
