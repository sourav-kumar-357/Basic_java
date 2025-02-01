package Section_10_methods;

public class Program9_PractisingVariableArguments {
    
    static void show(int...A) {
        for ( int x : A) {
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        show(); System.out.println();
        show(10, 20, 30); System.out.println();
        show(new int[] {32, 56, 87, 54}); System.out.println();
        
    }
}
