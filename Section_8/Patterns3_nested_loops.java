package Section_8;

public class Patterns3_nested_loops {
    public static void main(String[] args) {
        pattern1();
    }
    public static void pattern1() {
        /*
        * * * * * 
          * * * *
            * * *
              * *
                *
         */
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                if (j <= i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
