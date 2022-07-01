package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerDAOTest {
    Customer testCustomer1 = new Customer(1, "Sven Svensson", "ss@ss.se");
    Customer testCustomer2 = new Customer(2, "Erik Erikson", "ee@ee.se");
    CustomerDAO customerDAO = new CustomerDAO(testCustomer1);

    @Test
    void addCustomer() {
        assertTrue(customerDAO.addCustomer(testCustomer1));
        assertTrue(customerDAO.addCustomer(testCustomer2));
        System.out.println(customerDAO.customerList);
    }

    @Test
    void findCustomer() {
        assertTrue(customerDAO.findCustomer(testCustomer1));
    }

    @Test
    void removeCustomer() {
        assertTrue(customerDAO.removeCustomer(testCustomer2));
    }
}