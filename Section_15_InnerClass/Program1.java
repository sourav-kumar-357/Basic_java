// Practicing the Inner classes

// The Package .com 
package Section_15_InnerClass;

// making an outer class here 
class Outer {

    int x = 10;
    // For doing this we need to make object of the inner class outside the inner class
    Inner In = new Inner();

    // Now making the Inner class here
    class Inner {

        int y = 20;
        public void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }

    // Now making another display method outside the Inner class to access the memebers of the Inner classes
    public void outerDisplay() {

        System.out.println(In.y);
        In.innerDisplay();
    }
}

// The actual class present there
public class Program1 {
    
    // the main class present there
    public static void main(String[] args) {
        
        // Creating the object of the Outer class here 
        Outer out = new Outer();
        out.outerDisplay();

        // Here we are directly making the object of the Inner class inside the main class instead of makimg the object of inner class then using the inner class inside of that 
        Outer.Inner Inn = new Outer().new Inner();
        Inn.innerDisplay();
    }
}
