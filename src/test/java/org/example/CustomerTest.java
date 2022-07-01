package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void getCustomerInfo() {
        //Arrange
        Customer jn = new Customer(11, "Jack Ninway",  "jn@jn.se");
        String expectedStr = "";
        String setPerson = "id: 11 name: Jack Ninway email: jn@jn.se";
        //Act
        expectedStr = jn.getCustomerInfo();

        assertEquals(expectedStr, setPerson, "No  match.");

    }
}