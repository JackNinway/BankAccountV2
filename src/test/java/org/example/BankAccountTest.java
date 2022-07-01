package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    Customer jn = new Customer(11,"Jack Ninway","jn@jn.se");
    BankAccount aBankAccount = new BankAccount(1111, 999, jn);
    @Test
    void getAccountInfo() {
        //Arrange
        String expectedStr = "";
        String setStr = "AccountNr: 1111 Customer: id: 11 name: Jack Ninway email: jn@jn.se";
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
        System.out.println(aBankAccount.withdraw(1111));
    }
}