public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", "Alice", 1000.00, 0.02);
        savingsAccount.displayAccountInfo();
        savingsAccount.deposit(200);
        savingsAccount.withdraw(100);
        savingsAccount.displayAccountInfo();

        // Create a CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount("CA54321", "Bob", 500.00, 200.00);
        checkingAccount.displayAccountInfo();
        checkingAccount.deposit(150);
        checkingAccount.withdraw(600);
        checkingAccount.displayAccountInfo();
    }
}
