import org.junit.Test;

public class ContactTest {

  @Test public void createValidContactData() {
      Contact contact = new Contact("0000000", "First", "Last", "0000000000", "Test Address");
      System.out.println(contact);
   }
   
}