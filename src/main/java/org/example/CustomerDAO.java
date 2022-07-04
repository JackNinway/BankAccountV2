package org.example;
import java.util.List;
import java.util.*;


public class CustomerDAO {

    private Customer customerElement;

    List<Customer> customerList = new ArrayList<Customer>();

    public CustomerDAO() {
    }

    public boolean  addCustomer(Customer customer) {
        if (customerList.size() == 0) {
            customerList.add(customer);
            return  true;
        }
        if (customerList.contains(customer))
            throw new IllegalArgumentException("Customer already exists. INVALID ACTION");
        for (Customer c : customerList) {
            if ((c.getiD() != customer.getiD()) && (c.getEmail() != customer.getEmail())) {
              customerList.add(customer);
              return true;
            }
        }
        return false;
    }
    public Customer findCustomer(Customer customer){
        for (Customer c : customerList) {
//            if (c.equals(customer)) {
              if(  customerList.contains(customer.getiD()));
                return c;
            }
        return null;
        }

    public boolean removeCustomer (Customer customer){
        return customerList.remove(customer);

    }
}





