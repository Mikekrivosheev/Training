package phonebook;

/**
 * Created by Mike on 19.01.2017.
 */
public class Contact implements Comparable<Contact> {
    private long id;
    private String phoneNumber;
    private String name;

    public Contact(long id, String phoneNumber, String name) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Contact o) {
        return this.name.compareTo(o.getName());
    }
}
