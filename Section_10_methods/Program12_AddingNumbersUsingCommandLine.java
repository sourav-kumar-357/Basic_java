package Section_10_methods;

public class Program12_AddingNumbersUsingCommandLine {
    
    public static void main(String[] args) {
        
        double sum = 0;

        for (String x : args) {
            sum += Double.parseDouble(x);
        }

        System.out.println("The sum is " + sum);
    }
}
