package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void getCustomerInfo() {

        //Arrange
        Customer jn = new Customer(78, "Jack Ninway",  "jn@jn.se");
        String expectedStr = "";
        String setStr = "id: 78 name: Jack Ninway email: jn@jn.se";
        //Act
        expectedStr = jn.getCustomerInfo();

        assertEquals(expectedStr, setStr, "No  match.");

    }
}