// Demo of the Thread class option to achieve the multithreading

package Section_19_Multithreading;

// The new class extending the thread class to achieve multithreading
class Test extends Thread {

    @Override // The inbuilt method of the throw class 
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println(i + " hello ");
            i++;
        }
    }
}
public class Program1 {
    
    public static void main(String[] args) {
        
        // Creating an object of the Test class 
        Test t1 = new Test();
        t1.start();
        
        int i = 1;
        while (i < 100) {
            System.out.println(i + " world ");
            i++;
        }
    }
}
