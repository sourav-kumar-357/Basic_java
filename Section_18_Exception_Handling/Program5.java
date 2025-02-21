// The Checked Exceptions and their handling process

// The origin class of the program
public class Program5 {

    // Creating some anonymous functions here
    static void fun1() {
        // FileInputStream f1 = new FileInputStream("My.txt"); // Now this is is an
        // UnChecked exception and the compiler is
        // showing the exception and we have to handle it whatsoever
        // to run the program
    }

    // Creating the same type of function
    static void fun2() {
        fun1();
    }

    // Function part 3 to access the top one
    static void fun3() {
        fun2();
    }

    // The main class of the program is here
    public static void main(String[] args) {

        // calling the herirachy of functions
        fun3();

        System.out.println("Exiting the program");
        System.out.println("Bye");
    }
}
