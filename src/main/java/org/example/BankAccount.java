package org.example;
//import java.util.math;
public class BankAccount {

    private int accountNr;
    private double balance;
    private Customer aCustomer;
    private static int accountNrSeq = 7070;
    private int iD;

    public BankAccount() {
        accountNr = accountNrSeq++;
        setBalance(0);
    }
    public String getAccountInfo() {
        return  "Customer name: "   + aCustomer.getName() +
                " Account number: " + accountNr +
                " Balance: "        + balance +
                " E-mail: "         + aCustomer.getEmail() +
                " Customer ID: "    + aCustomer.getiD() +
                " Total accounts: " + (aCustomer.getAllAccounts().size() + 1);
    }
    public double deposit(double amount){
        if(amount < 0)
            throw new IllegalArgumentException("Amount should be more than zero. INVALID ACTION");
        balance += amount;
        return balance;
    }

    // Remove money from balance.
    public double  withdraw(double amount){
        if(amount > balance)
            throw new IllegalArgumentException("you have not enough money. INVALID ACTION");
        if(amount < 0)
           throw new IllegalArgumentException("Amount should be more than zero. INVALID ACTION");
        if (amount < balance) {
            balance -= amount;
            System.out.printf(" You have:\t  %.2f \n", balance );
        }
        return balance;
    }
    public int getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(int accountNr) {
        this.accountNr = accountNr;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getaCustomer() {
        return aCustomer;
    }

    public void setaCustomer(Customer aCustomer) {
        this.aCustomer = aCustomer;
    }
}
