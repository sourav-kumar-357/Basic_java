package Section_8;

public class Patterns1_nested_for_loops {

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
    }

    public static void pattern1() {
        /*
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void pattern2() {
        /*
        1 1 1 1 1 
        2 2 2 2 2
        3 3 3 3 3 
        4 4 4 4 4 
        5 5 5 5 5 
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void pattern3() {
        /*
        2 3 4 5 6 
        3 4 5 6 7 
        4 5 6 7 8 
        5 6 7 8 9 
        6 7 8 9 10
         */
        for (int i = 2; i <= 6; i++) {
            for (int j = i; j <= i+4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void pattern4() {
        /*
        01 02 03 04 05
        06 07 08 09 10
        11 12 13 14 15
        16 17 18 19 20 
        21 22 23 24 25 
         */
        for (int i = 1; i <= 21; i += 5) {
            for (int j = i; j < i+5; j++) {
                System.out.format("%02d ", j);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
} 
