package org.example;

public class Main {
    public static void main(String[] args) {
        Customer jn = new Customer("Jack Ninway","jn@jn.se");
        Customer ee = new Customer("erik erikson","ee@ee.se");
        CustomerDAO customerDAO = new CustomerDAO();
        BankAccount aBankAccount = new BankAccount();
        BankAccount aBankAccount2 = new BankAccount();
        aBankAccount.setBalance(999);
        aBankAccount2.setBalance(333);
        aBankAccount.setaCustomer(jn);
        aBankAccount2.setaCustomer(ee);

        System.out.println(aBankAccount.getAccountInfo());
        System.out.println(aBankAccount.deposit(1));
        System.out.println(aBankAccount.withdraw(99));
        if(customerDAO.addCustomer(ee));
            System.out.println("new customer was added");
        if(customerDAO.findCustomer(ee) == null)
            System.out.println("could not find it");

    }
}