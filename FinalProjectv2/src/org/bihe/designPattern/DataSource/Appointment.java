package org.bihe.designPattern.DataSource;


import java.time.format.DateTimeFormatter;

public class Appointment extends Entity {
    private int id;
    private DateTimeFormatter dateTime;
    private Staff staff;
    private Customer customer;


    public Appointment(int id, DateTimeFormatter dateTime, Staff staff, Customer customer) {
        this.id = id;
        this.dateTime = dateTime;
        this.staff = staff;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DateTimeFormatter getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTimeFormatter dateTime) {
        this.dateTime = dateTime;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    void insert() {
// create appointment with factory
        // add appointment to list
    // write to file
        //create Enti
        // subject.setEvent(entity)
        //
    }

    @Override
    void update() {

    }

    @Override
    boolean check(String field, String operand, String input) {
        return false;
    }
}
