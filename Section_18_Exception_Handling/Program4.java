// Checked vs the UnChecked Exception

public class Program4 {

    // Making the first function here
    static void fun1() {
        System.out.println(10 / 0);
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
    }
}
