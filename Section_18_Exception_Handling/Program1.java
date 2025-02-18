// Practicing the Try and Catch block in java Exception handling section

public class Program1 {

    public static void main(String[] args) {

        try {
            int a = 10, b = 0, c;
            c = a / b;

            System.out.println(c);

        } catch (ArithmeticException e) {

            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("bye");
    }
}
