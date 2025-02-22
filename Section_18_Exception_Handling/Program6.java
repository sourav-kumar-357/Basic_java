// Demo of the Throw and Throws part

// Creating a new exception class here
class NegativeDimensionException extends Exception {

    // Creating a method for our new class
    public String toString() {
        return "Dimensions cannot be negative";
    }
}
// The original class of our program
public class Program6 {

    // An area function that will cause the exception
    static int area(int l, int b) throws NegativeDimensionException {

        // checking if the dimensions are positive or not 
        if ((l <= 0) || (b <= 0)) {
            throw new NegativeDimensionException();
        }
        return l*b;
    }

    // Method to call the area function
    static void meth1() throws NegativeDimensionException{
        System.out.println(area(-12, 45));
    }

    // Main class of the file
    public static void main(String[] args) {

        // writting some normal codes here
        System.out.print("The area is ");

        // Using the try and Catch method to handle it
        try{
            meth1();
        } catch(NegativeDimensionException e){
            System.out.println(e);
        }
        System.out.println("Exiting the program");
    }
}
