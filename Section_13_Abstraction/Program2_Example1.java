package Section_13_Abstraction;

// Creating an abstract class
abstract class twoDshape {

    // Defining some commonly used dimensions
    private double width;
    private double height;
    private String name;

    // Creating a default constructor here 
    public twoDshape() {
        width = height = 0.0;
        name = "null";
    }

    // Constructor with some parameters
    public twoDshape(double height, double width, String name) {
        this.height = height;
        this.name = name;
        this.width = width;
    }

    // constructor if the height and width is equal 
    public twoDshape(double height, String name) {
        this.name = name;
        this.height = this.width = height;
    }

    // Trying to access the private methods 
    public double getHeight() {
        return height;
    }
    public String getName() {
        return name;
    }
    public double getWidth() {
        return width;
    }

    // Creating a normal methods for example a to string method
    public String toString() {
        return "Height = " + getHeight() + "\nWidth = " + getWidth() + "\nName = " + getName();
    }

    // Defining an abstract class here 
    abstract double area();

}

// Defining a sub class froma  sub class here 
class Triangle extends twoDshape {

    // Defining a new variable here 
    private String style;

    // Creating a default constructor
    Triangle() {
        super();
        style = "null";
    }

    // taking some parameter and creating a constructor
    Triangle(String style, double h, double w) {
        super(h, w, "Triangle");
        this.style = style;
    }

    // taking some parameter and creating another constructor
    Triangle(String style, double w) {
        super(w, "Triangle");
        this.style = style;
    }

    // Using an abstract method here 
    double area () {
        return getHeight() * getWidth() * 0.5;
    }

    // For accessing the private variables
    public String getStyle() { // For accessing the private variables
        return style;
    }

    // Overriding some of the methods of super class twoDshape
    @Override
    public String toString() {
        return "Height = " + getHeight() + "\nWidth = " + getWidth() + "\nName = " + getName() + "\nStyle = " + getStyle();
    }
}

class Rectangle extends twoDshape {

    // Creating a default constructor
    Rectangle() {
        super();
    }

    // taking some parameter and creating a constructor
    Rectangle(String style, double h, double w) {
        super(h, w, "Rectangle");
    }

    // taking some parameter and creating another constructor
    Rectangle(String style, double w) {
        super(w, "Triangle");
    }

    // Using an abstract method here 
    double area () {
        return getHeight() * getWidth() * 0.5;
    }

    // Overriding some of the methods of super class twoDshape
    @Override
    public String toString() {
        return "Height = " + getHeight() + "\nWidth = " + getWidth() + "\nName = " + getName();
    }
}

public class Program2_Example1 {
    public static void main(String[] args) {
        
        twoDshape shapes[] = new twoDshape[4];
        shapes[1] = new Triangle();
        shapes[2] = new Triangle("Isoscelus", 12, 54);
        shapes[3] = new Rectangle();
        shapes[0] = new Rectangle("abc", 154, 52);

        System.out.println(shapes[0].toString());
        System.out.println();
        System.out.println(shapes[1].toString());
        System.out.println();
        System.out.println(shapes[2].toString());
        System.out.println();
        System.out.println(shapes[3].toString());
        System.out.println();

        System.out.println("area of the Triangle " + shapes[1].area());
        System.out.println("area of the Triangle " + shapes[2].area());
        System.out.println("area of the Triangle " + shapes[3].area());
        System.out.println("area of the Triangle " + shapes[0].area());
    }
}
