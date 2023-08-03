public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount(0, 0);
        BankAccount account2 = new BankAccount(0, 0);
        BankAccount account3 = new BankAccount(0, 0);

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        System.out.println("=============Account 1 Deposit============");
        account1.deposit(300, "checking");

        System.out.println("=============Account 2 Deposit============");
        account2.deposit(200, "savings");
        
        System.out.println("=============Account 3 Deposit============");
        account3.deposit(200, "checking");

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        System.out.println("=============Account 1 Withdraw============");
        account1.withdraw(200, "checking");

        System.out.println("=============Account 2 Withdraw============");
        account2.withdraw(300, "savings");

        System.out.println("=============Account 3 Withdraw============");
        account3.withdraw(100, "checking");

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Total number of accounts: " + BankAccount.getAccounts());

    }
}
