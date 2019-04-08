package src.com.simi.addressBook;


import src.com.simi.addressBook.Contact;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static src.com.simi.addressBook.Main.contacts;


public class Options {

    public static Scanner  in = new Scanner(System.in);

    public static void NewContact(){
        System.out.println("Please provide a contact name: ");
        String name = in.next();
        Contact con = new Contact(name);
        System.out.println("Please add a phone number: ");
        int num = in.nextInt();
        con.setPhoneNum(num);
        System.out.println("Please add an email address: ");
        String email = in.next();
        con.setEmail(email);
        System.out.println("Please add a home address: ");
        String home = in.next();
        con.setHomeAddr(home);
    }

    public static void ShowContact(Contact con){

            System.out.println("Name: "+con.getName());
            System.out.println("Phone number: "+con.getPhoneNum());
            System.out.println("E-Mail Address: "+con.getEmail());
            System.out.println("Home Address: "+con.getHomeAddr());


    }

    public static void ShowAll(){
        for (Contact con: contacts) {
            ShowContact(con);
            System.out.println("----------------------------------");
        }
    }

    public static void NameSearch(){

    }

    public static void PhoneSearch(){

    }

    public static void EditContact(){

    }

    public static void DeleteContact(){

    }

    public static void Quit(){}

    public static void ChooseOption(){
        System.out.println("Welcome! Please choose an option: ");
        System.out.println("(Enter the corresponding number.)");
        System.out.println("1. Show all contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search contacts by name.");
        System.out.println("4. Search contacts by phone number.");
        System.out.println("5. Edit contact.");
        System.out.println("6. Delete contact.");
        System.out.println("7. Terminate the application.");

        int option = in.nextInt();

        if (option == 1){
            ShowAll();
        }else if (option == 2){
            NewContact();
        }else if (option == 3){
            NameSearch();
        }else if (option == 4){
            PhoneSearch();
        }else if (option == 5){
            EditContact();
        }else if (option == 6){
            DeleteContact();
        }else if (option == 7){
            Quit();
        }
    }
}
