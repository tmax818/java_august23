public class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.deposit(320.42, "checking");
        account2.deposit(50.24, "savings");

        account1.getBalance();
        account2.withdraw(2450.0, "savings");

        account1.getBalance();
        account2.getBalance();
        System.out.println(" " + BankAccount.getTotalMoney());

    }
}