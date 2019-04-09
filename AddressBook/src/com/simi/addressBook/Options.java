package src.com.simi.addressBook;



import java.util.Scanner;

import static src.com.simi.addressBook.Main.contacts;


public class Options {

     static Scanner  in = new Scanner(System.in);

     static void NewContact(){
        System.out.println("Please provide a contact name: ");
        String name = in.next();
        Contact con = new Contact(name);
//        con.setName(name); kai dioxno name apo parenthesi pano
        System.out.println("Please add a phone number: ");
        int num = in.nextInt();
        con.setPhoneNum(num);
        System.out.println("Please add an email address: ");
        String email = in.next();
        con.setEmail(email);
        System.out.println("Please add a home address: ");
        String home = in.next();
        con.setHomeAddr(home);
        contacts.add(con);
    }

     static void ShowContact(Contact con){

            System.out.println("Name: "+con.getName());
            System.out.println("Phone number: "+con.getPhoneNum());
            System.out.println("E-Mail Address: "+con.getEmail());
            System.out.println("Home Address: "+con.getHomeAddr());
            System.out.println("----------------------------------");


    }

     static void ShowAll(){
        for (Contact con: contacts) {
            ShowContact(con);
//            tsimpa kodika apo ShowContact() kai sbise pano grammi.
       }
    }

     static Contact NameSearch(){
        System.out.println("Please provide the contact name you want to search. ");
        String wanted = in.next();
        Contact foundContact = null;
        for (Contact con:contacts) {
            String name = con.getName();
            if (wanted.equals(name)) {
                ShowContact(con);
                foundContact = con;
            }
        }
        return foundContact;
    }

     static Contact PhoneSearch(){
        System.out.println("Please provide the phone number you want to search. ");
        int wanted = in.nextInt();
        Contact foundContact = null;
        for (Contact con: contacts) {
            int phone = con.getPhoneNum();
            if (wanted == phone){
                ShowContact(con);
                foundContact = con;
            }
        }
        return foundContact;
    }

     static void EditContact(){
        System.out.println("Before you edit the contact choose how to search it: ");
        System.out.println("1. By name. ");
        System.out.println("2. By phone number");
        int searchOption = in.nextInt();
        Contact con = null;
        if (searchOption == 1){
             con = NameSearch();
        }else if (searchOption == 2){
             con = PhoneSearch();
        }else{
            System.out.println("Enter valid choice number.");
//            Gia na ksana emfanistoun oi epiloges.
            EditContact();
//            Gia na bgei apo ti methodo.
            return;
        }

        System.out.println("Do you want to edit the name? (yes/no)");
        String ans = in.next();
        if (ans.equals("yes")){
            System.out.println("Enter the new name: ");
            String NewName = in.next();
            con.setName(NewName);
        }
        System.out.println("Do you want to edit the phone number? (yes/no)");
        ans = in.next();
        if (ans.equals("yes")){
            System.out.println("Enter the new phone number: ");
            int NewPhoneNum = in.nextInt();
            con.setPhoneNum(NewPhoneNum);
        }
        System.out.println("Do you want to edit the e-mail address? (yes/no)");
        ans = in.next();
        if (ans.equals("yes")){
            System.out.println("Enter the new e-mail address: ");
            String NewEmail = in.next();
            con.setEmail(NewEmail);
        }
        System.out.println("Do you want to edit the home address? (yes/no)");
        ans = in.next();
        if (ans.equals("yes")){
            System.out.println("Enter the new home address: ");
            String NewHomeAddr = in.next();
            con.setHomeAddr(NewHomeAddr);
        }

        }



     static void DeleteContact(){
        System.out.println("Before you delete the contact choose how to search it: ");
        System.out.println("1. By name. ");
        System.out.println("2. By phone number");
        int searchOption = in.nextInt();
        Contact con = null;
        if (searchOption == 1){
            con = NameSearch();
        }else if (searchOption == 2){
            con = PhoneSearch();
        }else{
            System.out.println("Enter valid choice number.");
//            Gia na ksana emfanistoun oi epiloges.
            DeleteContact();
//            Gia na bgei apo ti methodo kathos exei mpei 2 fores.
            return;
        }
        contacts.remove(con);
        System.out.println("Contact was deleted successfully! ");
    }

     static void Quit(){
         Main.condition = false;
     }

    public static void ChooseOption(){
        System.out.println("Please choose an option: ");
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
