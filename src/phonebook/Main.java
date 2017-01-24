package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Mike on 17.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Contact> contactList;
        IPhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact(0, "+375259006776", "Yuri Benediktovich"));
        phoneBook.addContact(new Contact(1, "+1908767676", "Avraam Linkoln"));
        phoneBook.addContact(new Contact(5, "+3706577777", "Zigmantas Karious"));
        phoneBook.addContact(new Contact(55, "+1802934024", "Barbara Streisend"));
        phoneBook.addContact(new Contact(3, "+1569092023", "Simona Patrovna"));

        contactList = (TreeSet<Contact>) phoneBook.getAllContacts();
        System.out.println("----------------List of all Contacts---------------");
        for (Contact contact: contactList) {
            System.out.println(contact.getId() + " " + contact.getName() + " " + contact.getPhoneNumber() );
        }
        System.out.println("---------------------------------------------------");
    }


}
