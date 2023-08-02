package StudentWork.IsaiahSmyth.BankAccount;


public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances


    // CONSTRUCTOR
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance =0;
        // Be sure to increment the number of accounts
        accounts++;
    }
    

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalnace(){
        return savingsBalance;
    }

    public static int getAccounts(){
        return accounts;
    }

    public static double getTotalMoney(){
        return totalMoney;
    }
    

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void deposit(double amount, String account){
        if(account.equalsIgnoreCase("checking")){
            checkingBalance += amount;
        }else if (account.equalsIgnoreCase("savings")){
            savingsBalance += amount;
        }
        totalMoney += amount;
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public boolean withdraw(double amount, String account){
        if(account.equalsIgnoreCase("checking")){
            if(checkingBalance>=amount){
                savingsBalance -= amount;
                totalMoney -= amount;
                return true;
            }else{
                return false;
            }
        }else if (account.equalsIgnoreCase("saving")){
            if(savingsBalance >= amount) {
                savingsBalance -= amount;
                totalMoney -= amount;
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance() {
        System.out.println("checking Balance: " + checkingBalance);
        System.out.println("saving Balance: " + savingsBalance);
        System.out.println("Total Balance: " + (checkingBalance + savingsBalance));
    }
}