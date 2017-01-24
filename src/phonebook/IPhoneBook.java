package phonebook;

import java.util.Collection;

/**
 * Created by Mike on 19.01.2017.
 */
public interface IPhoneBook {
    Contact getContact(int id);
    void addContact(Contact contact);
    void editContact(int id);
    void deleteContact(int id);
    Contact getByNameContact(String name);
    Collection<Contact> getAllContacts();


}
