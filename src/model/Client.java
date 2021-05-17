package model;

import javafx.beans.binding.StringExpression;

public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;

    public Client(int id, String firstName, String lastName, String phoneNumber, String email,
                  String address, String city) {


        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.city = city;

    }

    public Client(int id, String ciprian, String juravle, String phoneNumber, String email, String address) {
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public boolean equals(Object o) {
        Client client = (Client) o;
        if (this.id == client.id) {
            return true;

        }
        return false;

    }
    @Override
    public int hashCode(){
        return 31*id;

    }
    @Override
    public String toString(){
        return "id= "+ id+ ", first name= "+ firstName+   " ,lastName= " + lastName + ", phoneNumber=" + phoneNumber+
                ", email=" + email + " , address=" + address +". city=" +city; }
}