package Section_10_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program10_Maximum_numbers {

    // Method to find maximum number using varargs
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
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
        int max = findMax(numbers);
        System.out.println("Maximum number is: " + max);

        scanner.close();
    }
}
