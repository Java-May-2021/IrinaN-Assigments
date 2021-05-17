public class BankAccountTester {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(100.00, 200.00);
        // System.out.println(account1.checkingBalance);
        // System.out.println(account1.accountNumber);
        // System.out.println(BankAccount.numberOfAccount);
        // System.out.println(BankAccount.totalMoneyInBank);

        System.out.println(account1.getcheckingbalance());
        System.out.println(account1.getsavingsbalance());

        BankAccount account2 = new BankAccount(400.00, 400.00);
        // System.out.println(account2.checkingBalance);
        // System.out.println(account2.accountNumber);
        // System.out.println(BankAccount.numberOfAccount);
        // System.out.println(BankAccount.totalMoneyInBank);

        System.out.println(account2.getcheckingbalance());
        System.out.println(account2.getsavingsbalance());

        account2.depositchecking(1000);
        account2.depositsavings(2000);

        System.out.println(account2.getcheckingbalance());
        System.out.println(account2.getsavingsbalance());

        BankAccount.printbankinfo();

        
    }
    
}
