class Account {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;
    
    public Account(String depositorName, String accountNumber, String accountType, double initialBalance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println("Deposit of " + amount + " Rp. successful.");
        }
    }
    
    public void displayAccountInfo() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance + " Rp.");
    }
    
}

class p8
{
    public static void main(String[] args) {
        Account account = new Account("Bhavya", "220130318020", "Savings", 2000);
        account.deposit(1500);
        account.displayAccountInfo();
    }
}