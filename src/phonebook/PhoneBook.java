package phonebook;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Mike on 19.01.2017.
 */
public class PhoneBook implements IPhoneBook {

    private Set<Contact> contacts = new TreeSet<>();

    @Override
    public Contact getContact(int id) {

        return null;
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void editContact(int id) {

    }

    @Override
    public void deleteContact(int id) {

    }

    @Override
    public Contact getByNameContact(String name) {
        return null;
    }

    @Override
    public Collection<Contact> getAllContacts() {
        return contacts;
    }
}
