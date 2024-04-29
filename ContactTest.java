package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import contact.Contact;

public class ContactTest {

    // Test to ensure that Contact ID cannot have more than 10 characters
    @Test
    @DisplayName("Contact ID cannot have more than 10 characters")
    void testContactIDWithMoreThanTenCharacters() {
        // Create a Contact object with a long Contact ID
        Contact contact = new Contact("12323232", "FirstName", "LastName", "PhoneNumbr", "Address");
        // Check if the length of the Contact ID exceeds 10 characters
        if (contact.getContactID().length() > 10) {
            fail("Contact ID has more than 10 characters.");
        }
    }

    // Test to ensure that Contact First Name cannot have more than 10 characters
    @Test
    @DisplayName("Contact First Name cannot have more than 10 characters")
    void testContactFirstNameWithMoreThanTenCharacters() {
        Contact contact = new Contact("1", "OllyOllyOxenFree", "LastName", "5555555555", "Address");
        if (contact.getFirstName().length() > 10) {
            fail("First Name has more than 10 characters.");
        }
    }

    // Test to ensure that Contact Last Name cannot have more than 10 characters
    @Test
    @DisplayName("Contact Last Name cannot have more than 10 characters")
    void testContactLastNameWithMoreThanTenCharacters() {
        Contact contact = new Contact("1", "FirstName", "OllyOllyOxenFree", "5555555555", "Address");
        if (contact.getLastName().length() > 10) {
            fail("Last Name has more than 10 characters.");
        }
    }

    // Test to ensure that Contact phone number is exactly 10 characters
    @Test
    @DisplayName("Contact phone number is exactly 10 characters")
    void testContactNumberWithMoreThanTenCharacters() {
        // Create a Contact object with a phone number longer than 10 digits
        Contact contact = new Contact("1", "FirstName", "LastName", "55555555555", "Address");
        // Check if the length of the phone number is not equal to 10
        if (contact.getNumber().length() != 10) {
            fail("Phone number length does not equal 10.");
        }
    }

    // Test to ensure that Contact address cannot have more than 30 characters
    @Test
    @DisplayName("Contact address cannot have more than 30 characters")
    void testContactAddressWithMoreThanThirtyCharacters() {
        // Create a Contact object with an address longer than 30 characters
        Contact contact = new Contact("1", "FirstName", "LastName", "PhoneNumbr",
                "123456789 is nine characters long" + "123456789 is another nine characters long");
        // Check if the length of the address exceeds 30 characters
        if (contact.getAddress().length() > 30) {
            fail("Address has more than 30 characters.");
        }
    }

    // Test to ensure that Contact First Name shall not be null
    @Test
    @DisplayName("Contact First Name shall not be null")
    void testContactFirstNameNotNull() {
        // Create a Contact object with null First Name
        Contact contact = new Contact("1", null, "LastName", "PhoneNumbr", "Address");
        // Check if the First Name is not null
        assertNotNull(contact.getFirstName(), "First name was null.");
    }

    // Test to ensure that Contact Last Name shall not be null
    @Test
    @DisplayName("Contact Last Name shall not be null")
    void testContactLastNameNotNull() {
        // Create a Contact object with null Last Name
        Contact contact = new Contact("1", "FirstName", null, "PhoneNumbr", "Address");
        // Check if the Last Name is not null
        assertNotNull(contact.getLastName(), "Last name was null.");
    }

    // Test to ensure that Contact Phone Number shall not be null
    @Test
    @DisplayName("Contact Phone Number shall not be null")
    void testContactPhoneNotNull() {
        // Create a Contact object with null Phone Number
        Contact contact = new Contact("1", "FirstName", "LastName", null, "Address");
        // Check if the Phone Number is not null
        assertNotNull(contact.getNumber(), "Phone number was null.");
    }

    // Test to ensure that Contact Address shall not be null
    @Test
    @DisplayName("Contact Address shall not be null")
    void testContactAddressNotNull() {
        // Create a Contact object with null Address
        Contact contact = new Contact("1", "FirstName", "LastName", "PhoneNumbr", null);
        // Check if the Address is not null
        assertNotNull(contact.getAddress(), "Address was null.");
    }
}
