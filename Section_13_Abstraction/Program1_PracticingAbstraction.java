package Section_13_Abstraction;

abstract class Super { // making an abstract class
    public Super() {
        System.out.println("Super class constructor");
    }

    public void meth1() {
        System.out.println("Method one of super class");
    }

    abstract public void meth2();
}

class Sub extends Super {
    public Sub() {
        System.out.println("This is the sub Class");
    }

    @Override
    public void meth2() {
        System.out.println("This is an abstract method");
    }
}

public class Program1_PracticingAbstraction {
    public static void main(String[] args) {
        // Super s1 = new Super(); // Showing an error as we cannot make object of
        // abstract class
        // s1.meth1();

        Super s2 = new Sub();
        s2.meth1();
        s2.meth2();
        System.out.println();

        Sub s3 = new Sub();
        s3.meth1();
        s3.meth2();
    }
}
