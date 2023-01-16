package sdf;
public class FixedDepositAccount extends BankAccount{

    public static double interest = 3.0;
    public static double duration = 6.0;

    public FixedDepositAccount(String accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public void deposit(double amount){
        System.out.println("No operation (deposit)");
    }

    @Override
    public void withdraw(double amount){
        System.out.println("No operation (withdrawal)");
    }

 @Override
    public void showAccount(){
        System.out.println("Account number: " + super.getAccountNumber());
        System.out.println("Full Name: " + super.getName());
        System.out.println("Balance: " + super.getAccountBalance());
        System.out.println("Inheritance");
        System.out.println();
    }



    
    
}
