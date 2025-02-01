package Section_12_Inheritance;

class Circle {

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

class Cylinder extends Circle {

    public double height;

    public double volume() {
        return area()*height;
    }
}

public class Program1_Practicing_Inheritance {
    
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        c1.height = 7;
        c1.radius = 10;
        System.out.println("Volume: "+c1.volume());
        System.out.println("Area: "+c1.area());
    }
}
