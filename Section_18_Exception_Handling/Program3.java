// Demonstration of the nested try and Catch block on java Exception handling part

package Section_18_Exception_Handling;

public class Program3 {

    // The main class of the program
    public static void main(String[] args) {

        // Defining an array
        int A[] = { 30, 20, 10, 40, 0 };

        // Utilising the try block here
        try {

            // Putting some maths and printing the results
            int c = A[0] / A[2];
            System.out.println("Division is " + c);

            // Another try block under the first one
            try {

                // Trying to access the array out of the bond Exception here
                System.out.println("The digit at the 6th place in the array is " + A[10]);
            }

            // Now the cath block
            catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("You cannot access the index that is not defined in the array");
                System.out.println(e);
            }
        }

        // Here comes our catch Block
        catch (ArithmeticException e) {

            System.out.println("Denominator cannot be Zero");
            System.out.println(e);
        }

        // Here comes our Second Catch Block
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("You cannot access the index that is not defined in the array");
            System.out.println(e);
        }
    }
}
