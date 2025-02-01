package Section_7;

import java.util.Scanner;
public class Student_challenge_5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day number here : ");
        int day = sc.nextInt();
        Printing_days(day);

        System.out.print("Please enter the complete website link here : ");
        String link = sc.next();
        type_of_website(link);
        protocol_used(link);
        sc.close();
    }

    static void Printing_days(int day) {

        // We have to print the day by the number of the day 

        if (day == 1) {
            System.out.println("Sunday");
        }
        if (day == 2) {
            System.out.println("Monday");
        }
        if (day == 3) {
            System.out.println("Tuesday");
        }
        if (day == 4) {
            System.out.println("Wednesday");
        }
        if (day == 5) {
            System.out.println("Thursday");
        }
        if (day == 6) {
            System.out.println("Friday");
        }
        if (day == 7) {
            System.out.println("Saturday");
        } 
        if (day > 7) {
            System.out.println("Invalid day number");
        }
    }

    static void protocol_used(String link) {

        // we are here to find out the protocol used at the end of the website entered 
        // we first need to find out the last dot mentioned here in the website is at which index 
        int index = link.lastIndexOf(".");

        // Now we need to cut the prefix part to check it 
        String str1 = link.substring(index + 1);

        if (str1.equals("com")) {
            System.out.println("Commercial website");
        }
        if (str1.equals("gov")) {
            System.out.println("government website");
        }
        if (str1.equals("org")) {
            System.out.println("organisation website");
        }
        if (str1.equals("net")) {
            System.out.println("network website");
        }
        if (str1.equals("biz")) {
            System.out.println("buisness website");
        }
    }

    static void type_of_website(String link) {

        // for this again we have to cut the first prefix part and then we have to compare it with different one's 

        int index = link.indexOf(":");
        String str1 = link.substring(0, index);

        if (str1.equals("https")) {
            System.out.println("secured Hyper text transfer protocol");
        }
        if (str1.equals("http")) {
            System.out.println("Hyper text transfer protocol");
        }
        if (str1.equals("ftp")) {
            System.out.println("File transfer protocol");
        }
    }
}