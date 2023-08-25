public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and
        // display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.deposit("checking", 100.00);
        account1.getBalance("checking");
        account2.deposit("savings", 2570.00);
        System.out.println(account2.getSavingsBalance());
        account3.deposit("checking", 500.00);
        System.out.println(account3.getCheckingBalance());

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account
        // and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        account1.withdraw("checking", 150.00);
        System.out.println(account1.getCheckingBalance());
        account2.withdraw("savings", 1000.00);
        System.out.println(account2.getSavingsBalance());
        account3.withdraw("checking", 100.00);
        System.out.println(account3.getCheckingBalance());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("There are currently " + BankAccount.getAccounts() + " Accounts" + " with a total of $"
                + BankAccount.getTotalMoney() + " dollars in the bank");

        // for static you have to use the class name to call the method ccause its the
        // whole class

        // System.out.println("you haave " + account1.getAccounts() + " accounts");
        // System.out.println(account1.getBalance("checking"));
        // System.out.println(account1.getBalance("savings"));
    }
}