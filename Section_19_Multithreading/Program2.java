// Demo of the Thread class option to achieve the multithreading

package Section_19_Multithreading;

// The new class extending the thread class to achieve multithreading
class Test2 implements Runnable {

    @Override // The inbuilt method of the throw class 
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println(i + " hello ");
            i++;
        }
    }
}
public class Program2 {
    
    public static void main(String[] args) {
        
        // Creating an object of the Test class 
        Test2 m1 = new Test2();
        // Creating an object of the Thread class
        Thread t2 = new Thread(m1);
        t2.start();
        
        int i = 1;
        while (i < 100) {
            System.out.println(i + " world ");
            i++;
        }
    }
}
