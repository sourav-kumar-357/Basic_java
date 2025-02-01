// Practicing code for the Interfaces in Java 

package Section_14_PracticeInterface;

interface Test1 {
    void meth1();
    void meth2();
}

class My implements Test1 {

    @Override
    public void meth1() {
        System.out.println("I am method 1");
    }
    @Override
    public void meth2() {
        System.out.println("I am method 2");
    }
}

public class Program1 {
    public static void main(String[] args) {
        Test1 t1 = new My();

        t1.meth1();
        t1.meth2();
    }
}
