import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ContactBook {

    List<Contact> contacts;

     public ContactBook(Contact[] contacts){
         this.contacts = new LinkedList<Contact>(Arrays.asList(contacts));
     }

     public void deleteContact(Contact contact){
         boolean removed = contacts.remove(contact);

         if (removed) {
             System.out.println("Contact removed successfully.");
         } else {
             System.out.println("Contact not found in the list.");
         }
     }

     public Contact search(String contactName){
         for(Contact c: contacts){
             if(c.name.equals(contactName)){
                 System.out.printf("Found contact %s with number %s\n", c.name, c.phoneNumber);
                 return c;
             }
         }
         System.out.printf("No contact with name %s found\n", contactName);
         return null;
     }
}
