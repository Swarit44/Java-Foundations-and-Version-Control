
class BankAccount {

    // Private data members
    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Invalid withdrawal!");
        }
    }
}

public class Exercise2_Encapsulation {

    public static void main(String[] args) {

        BankAccount account =
            new BankAccount("Rahul", 5000);

        System.out.println("Account Holder: "
            + account.getAccountHolder());

        System.out.println("Initial Balance: "
            + account.getBalance());

        account.deposit(2000);
        account.withdraw(1000);

        System.out.println("Final Balance: "
            + account.getBalance());
    }
}
