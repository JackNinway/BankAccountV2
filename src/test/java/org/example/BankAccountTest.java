package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    Customer jn = new Customer("Jack Ninway","jn@jn.se");
    BankAccount aBankAccount = new BankAccount();
    @Test
    void getAccountInfo() {
        //Arrange
        aBankAccount.setBalance(999);
        String expectedStr = "";
        String setStr = "AccountNr: 7071 Customer: id: 11 name: Jack Ninway email: jn@jn.se";
        //Act
        expectedStr = aBankAccount.getAccountInfo();

        assertEquals(expectedStr, setStr, "No  match.");
    }

    @Test
    void deposit() {
        System.out.println(aBankAccount.deposit(-1));
    }

    @Test
    void withdraw() {
        System.out.println(aBankAccount.withdraw(99));
    }
}