package Section_14_PracticeInterface;

// Class representing the store
class Store {

    // Array to store the details of premium members
    Premium[] pre = new Premium[100];
    public int count = 0;

    // Method to register a new premium member
    void register(Premium p) {
        if (count < pre.length) {
            pre[count++] = p;
        } else {
            System.out.println("Cannot register more premium members. Limit reached.");
        }
    }

    // Method to invite all premium customers to a sale
    void inviteSale() {
        for (int i = 0; i < count; i++) {
            if (pre[i] != null) { // Ensuring no null references are called
                pre[i].callback();
            }
        }
    }
}

// Class representing normal customers
class Customers implements Premium {

    // Variable to store customer name
    private String name;

    // Constructor for Customers
    Customers(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println(name + ": Okay, I will visit!");
    }
}

// Class for premium members of the store
class PremiumMember implements Premium {

    // Variable to store premium member name
    private String name;

    // Constructor for PremiumMember
    PremiumMember(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println(name + ": Thank you for the exclusive invite. I will definitely come!");
    }
}

// Interface for Premium customers
interface Premium {

    // Abstract method
    void callback();
}

// Main program
public class Program3 {
    public static void main(String[] args) {

        // Creating a store instance
        Store myStore = new Store();

        // Creating and registering premium members
        PremiumMember premium1 = new PremiumMember("Charlie");
        PremiumMember premium2 = new PremiumMember("Diana");

        // Registering premium members in the store
        myStore.register(premium1);
        myStore.register(premium2);

        // Inviting all registered premium members to a sale
        System.out.println("Inviting Premium Members to the Sale:");
        myStore.inviteSale();

        // Creating and demonstrating normal customers
        Customers customer1 = new Customers("Alice");
        Customers customer2 = new Customers("Bob");

        // Normal customer callbacks (not registered in the store)
        System.out.println("\nNormal Customers:");
        customer1.callback();
        customer2.callback();
    }
}
