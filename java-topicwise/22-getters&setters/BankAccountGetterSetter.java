class BankAccount {

    // Private data members
    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for account holder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}

public class BankAccountGetterSetter {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Vighnesh", 5000);

        // Using Getters
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: ₹" + account.getBalance());

        // Using Setters
        account.setAccountHolder("Rahul");
        account.setBalance(7500);

        System.out.println("\nAfter Updating:");

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: ₹" + account.getBalance());

        // Invalid balance
        account.setBalance(-1000);
    }
}
