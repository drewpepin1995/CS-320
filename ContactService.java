import java.util.ArrayList;

public class ContactService {

    // contact list
    private ArrayList<Contact> contacts;

    // calling array
    public ContactService() {
        contacts = new ArrayList<>();
    }

    // add contact feature
    public boolean addContact(Contact contact){

        boolean contactAlready= false;

        //searching contact list if new contact already exists
        for (Contact contactList:contacts) {
            
            if (contactList.equals(contact)) {
                contactAlready = true;
            }
        }
            //if no match, add contact
            if (!contactAlready) {
                contacts.add(contact);
                return true;
            }
            else {
                return false;
            }
    }

    // delete method 
    public boolean deleteContact(String contactID) {

        for (Contact contactList:contacts) {
            // if entered = contactId, remove from list
            if (contactList.getContactID().equals(contactID)) {

                contacts.remove(contactList);
                return true;
            }
        }
        //If no match, return false
        return false;
    }

    // updating contact
    public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {

    for (Contact contactList:contacts) {

        //run through requirements
        if (contactList.getContactID().equals(contactID)) {
            if(!firstName.equals("") && !(firstName.length()>10)) {
                contactList.setFirstName(firstName);
            }
            if(!lastName.equals("") && !(lastName.length()>10)) {
                contactList.setFirstName(lastName);
            }
            if(!phoneNumber.equals("") && (phoneNumber.length()==10)) {
                contactList.setFirstName(phoneNumber);
            }
            if(!address.equals("") && !(address.length()>30)) {
                contactList.setFirstName(address);
            }
            return true; 
        }
    }
    return false;
}
}