package Section_10_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program11_SumofElement {

    static int sum(int...numbers) {
        int sum = 0;
        for ( int x : numbers) {
            sum += x;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        System.out.println("Enter the numbers (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numberList.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'done' to finish.");
            }
        }

        int[] numbers = numberList.stream().mapToInt(i -> i).toArray();
        int max = sum(numbers);
        System.out.println("Sum of elements is: " + max);

        scanner.close();
    }
}
