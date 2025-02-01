package Section_8;

public class Patterns2_nested_for_loops {
    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
    }
    public static void pattern1() {
        /*
        1
        1 2
        1 2 3
        1 2 3 4 
        1 2 3 4 5 
         */
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(j + " ");
            }
            count++;
            System.out.println();
        }
        System.out.println("\n");
    }
    public static void pattern2() {
        /*
        01
        02 03
        04 05 06 
        07 08 09 10
        11 12 13 14 15
         */
        int count = 0;
        for (int i = 0; i <=5; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    public static void pattern3() {
        /*
        01 02 03 04 05 
        06 07 08 09
        10 11 12 
        13 14
        15
         */
        int count = 1;
        int horizontal = 5;
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= horizontal; j++) {
                System.out.format("%02d ", count);
                count++;
            }
            System.out.println();
            horizontal--;
        }
    }
}
