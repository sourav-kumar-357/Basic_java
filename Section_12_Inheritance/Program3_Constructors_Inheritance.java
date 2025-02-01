package Section_12_Inheritance;

class parent {
    public parent() {
        System.out.println("Hello from parent class");
    }
}

class child extends parent {
    public child() {
        System.out.println("Hello from the child class");
    }
}
class Grandchild extends child {
    public Grandchild() {
        System.out.println("Hello from grandchild class");
    }
}
public class Program3_Constructors_Inheritance {
    public static void main(String[] args) {

        Grandchild a1 = new Grandchild();
        System.out.println(a1);
    }
}
