package Section_11_OOPs_Concepts;

class circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

public class Program1_CircleClass {
    
    public static void main(String[] args) {
        
        circle c1 = new circle();
        circle c2 = new circle();

        c2.radius = 10;
        c1.radius = 12;

        System.out.println("Area: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());
        System.out.println("circumference: " + c1.circumference());
        
        System.out.println("Area: " + c2.area());
        System.out.println("Perimeter: " + c2.perimeter());
        System.out.println("circumference: " + c2.circumference());
    }
}
