package Section_7;

import java.util.Scanner;
public class Student_challenge_6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Display the name of the day based on the number
        System.out.print("Please enter the day here : ");
        int day = sc.nextInt();
        day_print(day);

        // display the name of the month based on a number 
        System.out.print("Please enter the month number here : ");
        int month = sc.nextInt();
        month_print(month);

        // Display the type of the website here
        System.out.print("Please enter the url of the website here : ");
        String link = sc.next();
        website_type(link);

        // Make a menu driven program for arithmetic operations
        System.out.println("Please enter the operation you want to perform : ");
        System.out.println("Please enter the first number : ");
        float num1 = sc.nextFloat();
        System.out.println("Please enter the second number : ");
        float num2 = sc.nextFloat();
        char operation = sc.next().charAt(0);
        arithmetic_operations(operation, num1, num2);

        sc.close();
    }

    static void day_print(int day) {

        switch (day) {
            case 1: System.out.println("sunday");  
            break;
            
            case 2: System.out.println("monday");  
            break;
        
            case 3: System.out.println("Tuesday");  
            break;

            case 4: System.out.println("Wednesday");  
            break;

            case 5: System.out.println("Thursday");  
            break;

            case 6: System.out.println("Friday");  
            break;

            case 7: System.out.println("Saturday");  
            break;
        
            default: System.out.println("Invalid input");
            break;
        }
    }

    public static void month_print(int month) {
        switch (month) {
            case 1: System.out.println("January");  
            break;
            
            case 2: System.out.println("February");  
            break;
        
            case 3: System.out.println("March");  
            break;

            case 4: System.out.println("April");  
            break;

            case 5: System.out.println("May");  
            break;

            case 6: System.out.println("June");  
            break;

            case 7: System.out.println("July");  
            break;

            case 8: System.out.println("August");  
            break;

            case 9: System.out.println("September");  
            break;

            case 10: System.out.println("October");  
            break;

            case 11: System.out.println("November");  
            break;

            case 12: System.out.println("December");  
            break;
        
            default: System.out.println("Invalid input");
            break;
        }
    }

    public static void website_type(String link) {
        if (link.endsWith(".com")) {
            System.out.println("This is a commercial website");
        } else if (link.endsWith(".org")) {
            System.out.println("This is an organization website");
        } else if (link.endsWith(".in")) {
            System.out.println("This is an Indian website");
        } else {
            System.out.println("This is a foreign website");
        }
    }

    public static void arithmetic_operations(char operation, float num1, float num2) {
        switch (operation) {
            case '+': System.out.println("The sum of the two numbers is : " + (num1 + num2));  
            break;
            
            case '-': System.out.println("The difference of the two numbers is : " + (num1 - num2));  
            break;
        
            case '*': System.out.println("The product of the two numbers is : " + (num1 * num2));  
            break;

            case '/': System.out.println("The division of the two numbers is : " + (num1 / num2));  
            break;

            default: System.out.println("Invalid input");
            break;
        }

    }
}
