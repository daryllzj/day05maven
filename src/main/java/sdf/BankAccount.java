package sdf;

import java.util.List;

public class BankAccount {

    private String name;
    private final String accountNumber;
    private double accountBalance = 0.0;
    private List<String> transactions;
    private boolean accountStatus = true;
    private String openingDate;
    private String closingDate;

    public void showAccount(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Full Name: " + name);
        System.out.println("Balance: " + accountBalance);
        System.out.println();
    }

    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
                + ", transactions=" + transactions + ", accountStatus=" + accountStatus + ", openingDate=" + openingDate
                + ", closingDate=" + closingDate + "]";
    }

    public BankAccount(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String name, String accountNumber, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String name, String accountNumber, double accountBalance, List<String> transactions,
            boolean accountStatus, String openingDate, String closingDate) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.transactions = transactions;
        this.accountStatus = accountStatus;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
    }

    
    
    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public List<String> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }
    public boolean isAccountStatus() {
        return accountStatus;
    }
    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }
    public String getOpeningDate() {
        return openingDate;
    }
    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }
    public String getClosingDate() {
        return closingDate;
    }
    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount){

        if (!accountStatus) {
            throw new IllegalArgumentException("Account is closed ");
        }

        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Amount cannot be negative ");
            } else {
                accountBalance += amount;
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        
    }    

    public void withdraw(double amount){

        if (!accountStatus) {
            throw new IllegalArgumentException("Account is closed ");
        }

        if (accountBalance < amount) {
            throw new IllegalArgumentException("Insufficient funds ");
        } else{
            accountBalance -= amount;
        }
        
    }  

    
}
