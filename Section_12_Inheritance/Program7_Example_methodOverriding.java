package Section_12_Inheritance;

// Creating a new class
class TV {
    // Defining some methods 
    public void turnOn() {
        System.out.println("TV is switchd on");
    }
    // Defining some methods 
    public void changeChannel() {
        System.out.println("TV channel is changed ");
    }
}

// Inheriting the methods from super class 
class SmartTV extends TV {
    @Override // Overriding the existing methods
    public void turnOn() {
        System.out.println("SmartTV is switchd on");
    }
    @Override // Overriding the existing methods
    public void changeChannel() {
        System.out.println("SmartTV channel is changed ");
    }

    // Creating new methods
    public void browse() {
        System.out.println("Browsing SmartTV");
    }
}
public class Program7_Example_methodOverriding {
    public static void main(String[] args) {

        TV T = new TV(); // Creating objects of the super class first 
        System.out.println("\nTV (super class) methods: ");
        T.turnOn(); 
        T.changeChannel();

        SmartTV t2 = new SmartTV(); // Creating objects from the Sub class
        System.out.println("\nSmartTV (sub class) methods: ");
        t2.browse();
        t2.changeChannel();
        t2.turnOn();

        SmartTV t3 = new SmartTV(); // Creating objects from the Sub class and taking refernce of the super class
        System.out.println("\nSmartTV (sub class) methods and TV (super class) reference: ");
        t3.browse();
        t3.changeChannel();
        t3.turnOn();
    }
}
