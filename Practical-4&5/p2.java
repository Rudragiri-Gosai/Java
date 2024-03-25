class Account {
    private double balance;

    public Account(double a) {
        this.balance = a;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public synchronized void withdraw(double amount) throws InsufficientBalance {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InsufficientBalance("Not Sufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class InsufficientBalance extends Exception {
    public InsufficientBalance(String message) {
        super(message);
    }
}

public class p2 {
    public static void main(String[] args) {
        Account a1 = new Account(5000);
        try {
            a1.withdraw(2000);
            a1.withdraw(1500);
            a1.withdraw(3500);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Current Balance: " + a1.getBalance());
    }
}
