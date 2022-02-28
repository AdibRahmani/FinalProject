package org.bihe.designPattern.DataSource;

import java.util.Date;

public class Customer extends Entity {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int  age;
    private Date registrationDate;
    private String phoneNumber;

    public Customer(int id, String firstName, String lastName, String email, int age, Date registrationDate, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.registrationDate = registrationDate;
        this.phoneNumber = phoneNumber;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    void insert() {

    }

    @Override
    void update() {

    }

    @Override
    boolean check(String field, String operand, String input) {
        return false;
    }
}
