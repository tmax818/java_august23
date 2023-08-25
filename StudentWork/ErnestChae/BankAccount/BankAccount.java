public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accounts++;
    }

        // GETTERS
    // for checking, savings, accounts, and totalMoney

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account

    public void deposit(double money, String account){
        if (account.equals("checking")) {
            checkingBalance = checkingBalance + money;
        } else if (account.equals("savings")) {
            savingsBalance += money;
        }
        totalMoney = totalMoney + money;
    }


    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney

    public void withdraw(double money, String account) {
        if (account.equals("checking")) {
            if (checkingBalance >= money) {
                checkingBalance = checkingBalance - money;
                totalMoney -= money;
            } else {
                System.out.println("Not enough money.");
            }
        } else if (account.equals("savings")) {
            if (savingsBalance >= money) {
                savingsBalance -= money;
                totalMoney -= money;
            } else {
                System.out.println("NOt enough money.");
            }
        }
    }


    // getBalance
    // - display total balance for checking and savings of a particular bank account

    public void getBalance() {
        System.out.println("Savings: " + savingsBalance);
        System.out.println("Checking " + checkingBalance);
    }
}
