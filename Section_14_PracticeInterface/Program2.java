// Practicing a normal code for the multi-level interfaces and implementation 

package Section_14_PracticeInterface;

// Creating a concrete class
class Phone {

    // defining a random method
    void call() {
        System.out.println("\ncalling now ");
    }

    // Defining another random methods
    void sms() {
        System.out.println("\nTexting a message to someone ");
    }
}

// Creating a complete abstract class
interface camera {

    // creating some random abstract methods without using the word abstract as we are not in abstarct class but in the interfaces
    void click();
    void record();
}

// Creating another abstract class
interface musicPlayer {

    // Creating another method here
    void play();

    // creating another abstract method now
    void pause();
    void stop();
}

// Making a new Class that includes every class details
class smartphone extends Phone implements camera, musicPlayer {

    // Now doing the left over works from the Inherited classes
    @Override
    public void click() {
        System.out.println("\nClicking");
    }

    @Override
    public void record() {
        System.out.println("\nRecordig now");
    }

    @Override
    public void play() {
        System.out.println("\nPlaying the video now ");
    }

    @Override
    public void pause() {
        System.out.println("\npausing the video now");
    }

    @Override
    public void stop() {
        System.out.println("\nStopping the current video now\n");
    }
}

// the main program now
public class Program2 {
    public static void main(String[] args) {
        
        // creating the object of all these 
        smartphone s2 = new smartphone();
        s2.call();s2.click();s2.pause();s2.play();s2.record();s2.sms();s2.stop();
    }
}
