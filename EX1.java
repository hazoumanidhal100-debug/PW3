
class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Owner: " + ownerName + ", Balance: " + balance;
    }
}

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ahmed", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.setOwnerName("Ali");
        account.setBalance(1500.0);
        System.out.println(account.toString());
    }
}
