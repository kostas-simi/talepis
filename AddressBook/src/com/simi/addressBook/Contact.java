package com.simi.addressBook;

public class Contact implements Serializable {
    private String Name;
    private int PhoneNum;
    private String Email;
    private String HomeAddr;

    public Contact(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public int getPhoneNum() {
        return PhoneNum;
    }

    public String getEmail() {
        return Email;
    }

    public String getHomeAddr() {
        return HomeAddr;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setHomeAddr(String homeAddr) {
        HomeAddr = homeAddr;
    }


}
