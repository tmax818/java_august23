package StudentWork.IsaiahSmyth.BankAccount;


public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        System.out.println("Deposit Tests");
        account1.deposit(100, "checking");
        account1.getBalance();
        account2.deposit(200, "savings");
        account2.getBalance();
        account3.deposit(150, "checking");
        account3.getBalance();

        System.out.println("Total Money after Deposts: " + BankAccount.getTotalMoney());


        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
            System.out.println("Withdrawal Tests");
            account1.withdraw(50, "checking");
            account1.getBalance();
            account2.withdraw(50, "savings");
            account2.getBalance();
            account3.withdraw(50, "checking");
            account3.getBalance();

            System.out.println("Total Money after Withdrawals: " + BankAccount.getTotalMoney());
        

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Number of Bank Accounts: " + BankAccount.getAccounts());
        System.out.println();

    }
}