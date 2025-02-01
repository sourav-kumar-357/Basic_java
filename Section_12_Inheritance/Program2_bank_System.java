package Section_12_Inheritance;

class Account {

    private long accountno;
    private String name;
    private String address;
    private long phoneno;
    private String dob;
    public long balance;

    public long getAccountno() {
        return accountno;
    }
    public String getAddress() {
        return address;
    }
    public long getBalance() {
        return balance;
    }
    public String getDob() {
        return dob;
    }
    public String getName() {
        return name;
    }
    public long getPhoneno() {
        return phoneno;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    
}

class SavingsAccount extends Account {

    public void deopsit(long amount) {
        this.balance += amount;
        System.out.println("The amount " + amount + " is now deposited successfully and net balance now is : " + this.balance);
    }

    public void withdraw(long amount) {

        if (amount < this.balance) {
            this.balance -= amount;
            System.out.println("The amount " + amount + " is now debited successfully and your current balance is : " + this.balance);
        } else {
            System.out.print("Sorry we can't process your request as you have only " + this.balance + " in your account");
        }
    }
}

public class Program2_bank_System {
    
}
