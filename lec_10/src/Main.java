import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("John Doe", "123456789");
        Contact contact2 = new Contact("Jane Smith", "987654321");
        Contact contact3 = new Contact("Alice Johnson", "555555555");

        ContactBook contactBook = new ContactBook(new Contact[] {contact1, contact2, contact3});


        System.out.println("### Contacts example ###");
        contact1.details();
        contact2.seeNumber();
        contact3.call();

        System.out.println("### Contact Book search example ###");
        contactBook.search("Jane Smith");
        contactBook.search("Jane Austin");

        contactBook.deleteContact(contact2);

        System.out.println("### Contact Book after delete ###");
        for(Contact c: contactBook.contacts){
            c.details();
        }

    }
}