import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContactServiceTest {


    @Test
    public void testAdd() {
        ContactService cs = new ContactService();
        Contact test1 = new Contact("1234567", "Test", "Name", "1234567890", "Test 1 Lane");
        assertEquals(true, cs.addContact(test1));
    }

    @Test
    public void testDelete() {
        ContactService cs = new ContactService();

        Contact test1 = new Contact("1234567", "Test", "Name", "1234567890", "Test 1 Lane");
        Contact test2 = new Contact("2345678", "Sample", "Person", "2345678901", "Test 1 Drive");
        Contact test3 = new Contact("3456789", "Fake", "Guy", "3456789012", "Test 1 Circle");

        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);

        assertEquals(true, cs.deleteContact("1234567"));
        assertEquals(false, cs.deleteContact("1234568"));
        assertEquals(false, cs.deleteContact("1234567"));
    }

    @Test
    public void testUpdate() {
        ContactService cs = new ContactService();

        Contact test1 = new Contact("1234567", "Test", "Name", "1234567890", "Test 1 Lane");
        Contact test2 = new Contact("2345678", "Sample", "Person", "2345678901", "Test 1 Drive");
        Contact test3 = new Contact("3456789", "Fake", "Guy", "3456789012", "Test 1 Circle");

        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);

        assertEquals(true, cs.updateContact("1234567", "First", "Last", "0102030405", "New Address"));
        assertEquals(false, cs.updateContact("0000000", "First", "Last", "0000000000", "New Address"));
    }

}
