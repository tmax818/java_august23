public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount() {
        accounts++;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    // deposit

    public void deposit(String accountType, double amount) {
        if (accountType.equals("checking")) {
            this.checkingBalance += amount;
        } else if (accountType.equals("savings")) {
            this.savingsBalance += amount;
        }
        BankAccount.totalMoney += amount;
    }
    // withdraw
    // - users should be able to withdraw money from their checking or savings
    // account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney

    public void withdraw(String accountType, double amount) {
        if (accountType.equals("checking")) {
            if (this.checkingBalance - amount < 0) {
                System.out.println("Insufficient funds");
            } else {
                this.checkingBalance -= amount;
                BankAccount.totalMoney -= amount;
            }
        } else if (accountType.equals("savings")) {
            if (this.savingsBalance - amount < 0) {
                System.out.println("Insufficient funds");
            } else {
                this.savingsBalance -= amount;
                BankAccount.totalMoney -= amount;
            }
        }
    }

    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getBalance(String accountType) {
        if (accountType.equals("checking")) {
            System.out.println("Checking balance: " + this.checkingBalance);
            return this.checkingBalance;
        } else if (accountType.equals("savings")) {
            System.out.println("Savings balance: " + this.savingsBalance);
            return this.savingsBalance;
        } else {
            System.out.println("Invalid account type");
            return 0;
        }
    }
}
