public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.totalMoney = checkingBalance + savingsBalance;
        accounts++; 
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public static int getAccounts(){
        return accounts;
    }

    public double getTotalMoney(){
        return this.totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void deposit(double amount, String typeAccount){
        if(typeAccount == "checking"){
            this.checkingBalance += amount;
            this.getBalance();
        } else if(typeAccount == "savings"){
            this.savingsBalance += amount;
            this.getBalance();
        }
        this.totalMoney += amount;
        System.out.printf("Total Account Balance: %.2f\n", this.totalMoney);
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdraw(double amount, String typeAccount){
        if(typeAccount == "checking"){
            if(this.checkingBalance >= amount){
                this.checkingBalance -= amount;
                this.getBalance();
                this.totalMoney -= amount;
                System.out.printf("Total Account Balance: %.2f\n", this.totalMoney);
            } else {
                System.out.println("Insufficient funds in checking");
            }
        } else if(typeAccount == "savings"){
            if(this.savingsBalance >= amount){
                this.savingsBalance -= amount;
                this.getBalance();
                this.totalMoney -= amount;
                System.out.printf("Total Account Balance: %.2f\n", this.totalMoney);
            } else {
                this.getBalance();
                System.out.println("Amount attempted to withdraw: " + amount);
                System.out.println("Insufficient funds in savings");
            }
        }
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance(){
        System.out.println("Checking balance: " + this.checkingBalance);
        System.out.println("Savings balance: " + this.savingsBalance);
    }
}
