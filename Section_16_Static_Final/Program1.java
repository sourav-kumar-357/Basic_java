// Demo of the Static variables and the static calsses 

package Section_16_Static_Final;

class Test {

    // static variable
    static int x = 10;

    // Non-static variables
    int y = 20;

    // Static variable can be accessed by the non-static methods
    void show() {
        System.out.println(x);
    }

    // static variables can also be called by the static methods
    static void Display() {
        System.out.println(x);
    }

    // Non-static members cannot b accessed by the static methods of a class
    static void show1() {
        System.out.println("y");
    }
}

// the main class file 
public class Program1 {
    // The main class prsesent here
    public static void main(String[] args) {
        
        // Creating the object of the class
        Test t1 = new Test();
        t1.show();
        Test.Display();
        Test.show1();
    }
}
