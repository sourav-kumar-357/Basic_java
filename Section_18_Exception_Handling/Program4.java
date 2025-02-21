// The UnChecked Exception and handling them

public class Program4 {

    // Making the first function here
    static void fun1() {
        try {
            System.out.println(10 / 0); // Here this one is an exception but the compiler isn't showing us any errors
            // that means it is an unchecked Exception
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    // the second Function
    static void fun2() {
        fun1();
    }

    // The third Function
    static void fun3() {
        fun2();
    }

    // The main class of the program
    public static void main(String[] args) {

        // Calling the function 3 here
        fun3();
        System.out.println("Exiting the program");
    }
}
