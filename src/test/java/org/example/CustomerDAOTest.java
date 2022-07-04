package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerDAOTest {
    Customer testCustomer1 = new Customer( "Sven Svensson", "ss@ss.se");
    Customer testCustomer2 = new Customer( "Erik Erikson", "ee@ee.se");
    CustomerDAO customerDAO = new CustomerDAO();

    @Test
    void addCustomer() {
        assertTrue(customerDAO.addCustomer(testCustomer1));
        assertTrue(customerDAO.addCustomer(testCustomer2));
        System.out.println(customerDAO.customerList);
    }

 /*   @Test
    void findCustomer() {
        System.out.println(customerDAO.findCustomer(testCustomer1));
        String[] listToArray = customerDAO.findCustomer(testCustomer1).toArray(new String[0]);

        for (String s : listToArray)
            System.out.println(s);
        assertTrue(customerDAO.findCustomer(testCustomer1));
        System.out.println();
    }
*/
    @Test
    void removeCustomer() {
        assertTrue(customerDAO.removeCustomer(testCustomer2));
    }
}