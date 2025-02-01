package Section_8;

import java.util.Scanner;
public class Loop_practice {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        int i = 100;
        do {
            System.out.println(i);
            i = i * 2;
        } while (i < n);

        input.close();
    
        // Now write the same program using while loop
        int j = 100;
        while (j < n) {
            System.out.println(j);
            j = j * 2;
        }
    }
}