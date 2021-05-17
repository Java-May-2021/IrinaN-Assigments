import java.util.Random;

public class BankAccount{
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccount = 0;
    private static int totalMoneyInBank = 0; 
    
    public static double createaccountnumber(){
        Random rand = new Random();
        double doublerandom=rand.nextDouble() * 1000000000; // creates a double random number between 0 - 1
        return doublerandom;
    }

    public BankAccount (double a, double b){
        accountNumber = Double.toString(BankAccount.createaccountnumber());
        checkingBalance = a; // input
        savingsBalance = b; // input 
        numberOfAccount++;
        totalMoneyInBank += (a+b); 
    }

    public double getcheckingbalance(){
        return this.checkingBalance;
    }

    public double getsavingsbalance(){
        return this.savingsBalance;
    }

    public void depositchecking(double a){
        this.checkingBalance += a;
    }

    public void depositsavings(double a){
        this.savingsBalance += a;
    }

    public static void printbankinfo(){
        System.out.println("Total number of accounts are: " + BankAccount.numberOfAccount);
        System.out.println("Total money in this bank is: " + BankAccount.totalMoneyInBank);
    }

}