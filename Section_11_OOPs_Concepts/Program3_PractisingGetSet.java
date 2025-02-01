package Section_11_OOPs_Concepts;

import java.util.Scanner;

class Rectangles {

    public double length;
    public double breadth;

    public double getLength() {
        return this.length;
    }
    public double getBreadth() {
        return this.breadth;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 0;
        }
    }
    public void setBreadth(double breadth) {
        if (breadth > 0) {
            this.breadth = breadth;
        } else {
            this.breadth = 0;
        }
    }

    public double area () {
        return this.getLength()*this.getBreadth();
    }
}

public class Program3_PractisingGetSet {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Rectangles r2 = new Rectangles();

        System.out.print("\nPlease enter the Length here: ");
        r2.setLength(sc.nextDouble());
        System.out.print("\nEnter the breadth here: ");
        r2.setBreadth(sc.nextDouble());

        System.out.println("\nThe area of rectangle having length " + r2.getLength() + " and breadth " + r2.getBreadth() + " is " + r2.area());
        sc.close();
    }
}
