package Section_12_Inheritance;

class Super {
    
    public void display() {
        System.out.println("hello from super class");
    }
}

class Sub extends Super {

    public void display() {
        System.out.println("Hello form sub class");
    }
}
public class Program6_MethodsOverriding {
    public static void main(String[] args) {

        Super s1 = new Super();
        System.out.println("\nMethod of super class");
        s1.display();

        Sub s2 = new Sub();
        System.out.println("\nMethod of sub class");
        s2.display();

        Super s3 = new Sub();
        System.out.println("\nReference of super and object of sub");
        s3.display();
    }
}
