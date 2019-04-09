package src.com.simi.addressBook;




import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    static List<Contact> contacts = new ArrayList<>();
    public static boolean condition = true;


    public static void main(String[] args) {
        contacts = LoadContacts("addressBook.csv");
        System.out.println("Welcome! ");
        while(condition) {
            Options.ChooseOption();

        }
        SaveContacts(contacts,"addressBook.csv");
    }

    static List<Contact> LoadContacts(String filename) {
        List<Contact> con = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            con = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }

    static void SaveContacts(List<Contact> con, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(con);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
