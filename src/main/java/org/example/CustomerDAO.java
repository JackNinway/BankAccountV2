package org.example;
import java.util.List;
import java.util.*;


public class CustomerDAO {

    private Customer customerElement;

    List<Customer> customerList = new ArrayList<Customer>();

    public CustomerDAO(Customer customerElement) {
        this.customerElement = customerElement;
    }

    public boolean  addCustomer(Customer customer) {
        if (customerList.size() == 0)
            return  customerList.add(customer);
        for (Customer c : customerList) {
            if ((c.getiD() != customer.getiD()) && (c.getEmail() != customer.getEmail())) {
              return  customerList.add(customer);
            }
        }
        return false;
    }
        public boolean findCustomer(Customer customer){
           return customerList.contains(customer);

        }
        public boolean removeCustomer (Customer customer){
            return customerList.remove(customer);

        }
    }





