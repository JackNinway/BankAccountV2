package org.example;
//import java.util.math;
public class BankAccount {

    private int accountNr;
    private double balance;
    private Customer aCustomer;

    public BankAccount(int accountNr, double balance, Customer aCustomer) {
        this.accountNr = accountNr;
        this.balance = balance;
        this.aCustomer = aCustomer;
    }

    public String getAccountInfo(){
        return "AccountNr: " + accountNr + " Customer: " + aCustomer.getCustomerInfo();

    }
    public double deposit(double amount){
        if(amount < 0)
            throw new IllegalArgumentException("Amount should be more than zero. INVALID ACTION");
        balance += amount;
        return balance;
    }

    // Remove money from balance.
    public double  withdraw(double amount){
        if(amount > balance){
            if (amount < balance) {
                balance -= amount;
                System.out.printf(" You have:\t  %.2f \n", balance );
            }
            else
                System.out.println("you have not enough money");
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
