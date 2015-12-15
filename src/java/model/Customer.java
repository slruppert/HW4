
package model;

public class Customer {
    
    private int customerID;
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String city;
    private String state1;
    private int zip;
    private String emailAddr;
    private int age;

    public Customer() {
        this.customerID = 0;
        this.firstName = "";
        this.lastName = "";
        this.address1 = "";
        this.address2 = "";
        this.city = "";
        this.state1 = "";
        this.zip = 0;
        this.emailAddr = "";
        this.age = 0;
        
    }
     public Customer(int placesID, String firstName, String lastName, String address1, String address2, String city, String state1, int zip, String emailAddr, int age) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state1 = state1;
        this.zip = zip;
        this.emailAddr = emailAddr;
        this.age = age;
     }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

    