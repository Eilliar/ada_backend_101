public class Contact {

    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void details(){
        System.out.printf("Name: %s\tPhone: %s\n", name, phoneNumber);
    }

    public void call(){
        System.out.printf("Calling number %s\n", phoneNumber);
    }

    public void seeNumber(){
        System.out.printf("%s\n", phoneNumber);
    }
}

