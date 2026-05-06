
public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Omar", 1500);

        // Operations
        account.deposit(300);
        account.withdraw(200);

        // Change name
        account.setHolderName("Youssef");

        // Print result
        System.out.println(account);
    }
}
