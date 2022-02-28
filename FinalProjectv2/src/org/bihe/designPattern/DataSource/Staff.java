package org.bihe.designPattern.DataSource;

public class Staff extends Entity {
    private int staffId;
    private String fullName;
    private String emailAddress;
    private String role;
    private String skype;
    private String mobile;

    public Staff(int staffId, String fullName, String emailAddress, String role, String skype, String mobile) {
        this.staffId = staffId;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.role = role;
        this.skype = skype;
        this.mobile = mobile;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
