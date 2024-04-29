package main;


import java.util.HashMap;
import java.util.Map;

public class ContactService {
    // Using a HashMap to store contact objects for efficient lookup by contactID
    private Map<String, Contact> contactList = new HashMap<>();

    // Adds a new contact to the contact list if the ID is unique
    public boolean addContact(String contactID, String firstName, String lastName, String number, String address) {
        // Check if the contactID already exists
        if (contactList.containsKey(contactID)) {
            System.out.println("Contact with ID: " + contactID + " already exists.");
            return false;
        }
        // Create and add the new contact
        Contact contact = new Contact(contactID, firstName, lastName, number, address);
        contactList.put(contactID, contact);
        return true;
    }

    // Retrieves a Contact by ID, or null if the contact doesn't exist
    public Contact getContact(String contactID) {
        return contactList.get(contactID); // Returns null if the contact is not found
    }

    // Deletes a contact by ID, returning true if successful or false if the contact doesn't exist
    public boolean deleteContact(String contactID) {
        if (contactList.containsKey(contactID)) {
            contactList.remove(contactID);
            return true;
        } else {
            System.out.println("Contact ID: " + contactID + " not found.");
            return false;
        }
    }

    // Updates the first name of a contact
    public boolean updateFirstName(String contactID, String updatedFirstName) {
        Contact contact = getContact(contactID);
        if (contact != null) {
            contact.setFirstName(updatedFirstName);
            return true;
        } else {
            System.out.println("Contact ID: " + contactID + " not found.");
            return false;
        }
    }

    // Updates the last name of a contact
    public boolean updateLastName(String contactID, String updatedLastName) {
        Contact contact = getContact(contactID);
        if (contact != null) {
            contact.setLastName(updatedLastName);
            return true;
        } else {
            System.out.println("Contact ID: " + contactID + " not found.");
            return false;
        }
    }

    // Updates the phone number of a contact
    public boolean updateNumber(String contactID, String updatedNumber) {
        Contact contact = getContact(contactID);
        if (contact != null) {
            contact.setNumber(updatedNumber);
            return true;
        } else {
            System.out.println("Contact ID: " + contactID + " not found.");
            return false;
        }
    }

    // Updates the address of a contact
    public boolean updateAddress(String contactID, String updatedAddress) {
        Contact contact = getContact(contactID);
        if (contact != null) {
            contact.setAddress(updatedAddress);
            return true;
        } else {
            System.out.println("Contact ID: " + contactID + " not found.");
            return false;
        }
    }

    // Displays all contacts in the contact list
    public void displayContactList() {
        for (Contact contact : contactList.values()) {
            System.out.println("\tContact ID: " + contact.getContactID());
            System.out.println("\tFirst Name: " + contact.getFirstName());
            System.out.println("\tLast Name: " + contact.getLastName());
            System.out.println("\tPhone Number: " + contact.getNumber());
            System.out.println("\tAddress: " + contact.getAddress() + "\n");
        }
    }
}
