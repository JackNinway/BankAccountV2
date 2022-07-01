package org.example;

public class Customer {

    private int iD;
    private String name;
    private String email;

    public Customer(int iD, String name, String email) {
        this.iD = iD;
        this.name = name;
        this.email = email;
    }
    public String getCustomerInfo(){
            return "id: " + iD + " name: " + name + " email: " + email;
    }
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

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
