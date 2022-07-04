package org.example;
import java.util.ArrayList;

public class Customer {


    private static int customerSeq = 77;
    private int iD;
    private String name;
    private String email;
    private ArrayList<BankAccount> bankAccountList = new ArrayList<>();

    public Customer(String name, String email) {
        setiD(++customerSeq);
        setName(name);
        setEmail(email);
    }
    public String getCustomerInfo(){
            return "id: " + iD + " name: " + name + " email: " + email;
    }
    public void addBankAccount(BankAccount bankAcc) {
        bankAccountList.add(bankAcc);
    }

    public int getAccountListSize() {
        return bankAccountList.size();
    }

    public ArrayList<BankAccount> getAllAccounts() {
        return bankAccountList;
    }

// Getters & Setters
    public int getiD() { return iD;}

    public void setiD(int iD) {this.iD = iD;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
