package Section_10_methods;

import java.util.Scanner;

public class Program8_ValidatingName_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to validate: ");
        String name = scanner.nextLine();
        
        if (isValidName(name)) {
            System.out.println("The name is valid.");
        } else {
            System.out.println("The name is invalid.");
        }
        
        scanner.close();
    }

    public static boolean isValidName(String name) {
        // Check if the name is between 1 and 50 characters long
        if (name.length() < 1 || name.length() > 50) {
            return false;
        }
        
        // Check if the name contains only alphabetic characters
        return name.matches("[a-zA-Z]+");
    }
}
