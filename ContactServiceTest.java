package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import contact.Contact;
import contact.ContactService;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {

    @Test
    @DisplayName("Test to Update First Name.")
    @Order(1)
    void testUpdateFirstName() {
        ContactService service = new ContactService();
        service.addContact("1", "Mr.", "Shane", "5757571231", "386 brentfor Lane");
        String contactID = service.getContact("1").getContactID();
        service.updateFirstName("Wren", contactID);
        assertEquals("Wren", service.getContact(contactID).getFirstName(), "First name was not updated.");
    }

    @Test
    @DisplayName("Test to Update Last Name.")
    @Order(2)
    void testUpdateLastName() {
        ContactService service = new ContactService();
        service.addContact("1", "Mr.", "Shane", "5757571231", "386 brentfor Lane");
        String contactID = service.getContact("1").getContactID();
        service.updateLastName("Baba Voss", contactID);
        assertEquals("Baba Voss", service.getContact(contactID).getLastName(), "Last name was not updated.");
    }

    @Test
    @DisplayName("Test to update phone number.")
    @Order(3)
    void testUpdatePhoneNumber() {
        ContactService service = new ContactService();
        service.addContact("1", "Mr.", "Shane", "5757571231", "386 brentfor Lane");
        String contactID = service.getContact("1").getContactID();
        service.updateNumber("5555550000", contactID);
        assertEquals("5555550000", service.getContact(contactID).getPhone(), "Phone number was not updated.");
    }

    @Test
    @DisplayName("Test to update address.")
    @Order(4)
    void testUpdateAddress() {
        ContactService service = new ContactService();
        service.addContact("1", "Mr.", "Shane", "5757571231", "386 brentfor Lane");
        String contactID = service.getContact("1").getContactID();
        service.updateAddress("298 Apple drive", contactID);
        assertEquals("298 Apple drive", service.getContact(contactID).getAddress(), "Address was not updated.");
    }

    @Test
    @DisplayName("Test to ensure that service correctly deletes contacts.")
    @Order(5)
    void testDeleteContact() {
        ContactService service = new ContactService();
        service.addContact("1", "Mr.", "Shane", "5757571231", "386 brentfor Lane");
        String contactID = service.getContact("1").getContactID();
        service.deleteContact(contactID);
        assertNull(service.getContact(contactID), "The contact was not deleted.");
    }

    @Test
    @DisplayName("Test to ensure that service can add a contact.")
    @Order(6)
    void testAddContact() {
        ContactService service = new ContactService();
        service.addContact("1", "Mr.", "Shane", "5757571231", "386 brentfor Lane");
        String contactID = service.getContact("1").getContactID();
        assertNotNull(service.getContact(contactID), "Contact was not added correctly.");
    }
}
