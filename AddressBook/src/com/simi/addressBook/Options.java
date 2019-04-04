package com.simi.addressBook;

public class Options {

    public void NewContact(){
        System.out.println("Please provide a contact name: ");
        String name = System.console().readline();
        Contact con = new Contact(name);
        System.out.println("Please add a phone number: ");
        int num = System.console().readline();
        con.setPhoneNum(num);
        System.out
    }

    public void ShowContacts(){

    }

    public void NameSearch(String name){

    }

    public void PhoneSearch(int phone){

    }

    public void EditContact(String name){

    }

    public void DeleteContact(String name){

    }

    public void Quit(){}

}
