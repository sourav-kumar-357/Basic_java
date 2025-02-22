// the finally block usage is showcased here

// The original class of the program is mentioned here
public class Program7 {
    
    // The main class of the program 
    public static void main(String[] args) throws Exception{

        // Some normal code for this class main
        try {
            System.out.println(10/0);
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Final message");
        }
    }
}
