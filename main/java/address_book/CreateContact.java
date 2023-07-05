package address_book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CreateContact {
    private String fullName;
    private String phone;
    private String state;
    private String city;
    private String zip;

    public CreateContact(String fullName, String phone, String state, String city, String zip) {
        this.fullName = fullName;
        this.phone = phone;
        this.state = state;
        this.city = city;
        this.zip = zip;
    }

    public CreateContact() {

    }

    public int displayOption() {
        Scanner sc = new Scanner(System.in);
        System.err.println("1. Create Contact");
        System.err.println("2. Display Contact");
        System.err.println("3. Edit Contact");
        System.err.println("4. Delete Contact");
        System.err.println("5. Exit");
        System.err.println("Enter your choice");
        int operation = sc.nextInt();
        return operation;
    }

    public void checkDuplicateName(String fullName){
        if(Collections.binarySearch(AddressBook,fullName) > 0){
            System.out.println("Name already exists");
            System.exit(0);
        }
        else {
            AddressBook.add(fullName);
        }
    }
    List<String> AddressBook = new ArrayList<>();

    public List<String> addContact() {
//        List<String> AddressBook= new ArrayList<>();
        Scanner sc = new Scanner(System.in);


//            System.out.println("Enter your full name");
//            String fullName = sc.nextLine();
//            AddressBook.add(fullName);

            System.out.println("Enter your Phone");
            String phone = sc.next();
            AddressBook.add(phone);

            System.out.println("Enter your State");
            String state = sc.next();
            AddressBook.add(state);

            System.out.println("Enter your City");
            String city = sc.next();
            AddressBook.add(city);

            System.out.println("Enter your zip code");
            String zipCode = sc.next();
            AddressBook.add(zipCode);

            System.out.println(AddressBook + " adb");
//        }
            return AddressBook;


    }
    public void getFullDetails() {
        CreateContact csr = new CreateContact();
        System.out.println("get full details");
        System.out.println(AddressBook + "Address Book");

    }

    public void editContact(String  original, String replacement) {
        if(AddressBook.contains(original)){
            int ind = AddressBook.indexOf(original);
            System.err.println("Pre-Edit -> "+AddressBook.get(ind));
            AddressBook.set(ind, replacement);
            System.err.println("Post-Edit -> "+AddressBook.get(ind));
            System.out.println(AddressBook);
        }
        else {
            System.err.println(original+ " Does not exist in Address Book");
        }

    }

    public void deleteContact(String contactData){
        if(AddressBook.contains(contactData)){
            AddressBook.remove(contactData);
            System.err.println("Deleted -> "+contactData);
            System.out.println(AddressBook);
        }
        else {
            System.err.println("Address Book does not contain ->"+ '"' + contactData + '"');
        }
    }
}
