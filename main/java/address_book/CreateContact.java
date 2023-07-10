package address_book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        System.err.println("5. Search Contact");
        System.err.println("6. Count Contact");
        System.err.println("7. Sort Contact");
        System.err.println("8. Exit");
        System.err.println("Enter your choice");
        int operation = sc.nextInt();
        return operation;
    }

    public void checkDuplicateName(String fullName) {
        if (Collections.binarySearch(AddressBook, fullName) > 0) {
            System.out.println("Name already exists");
            System.exit(0);
        } else {
            AddressBook.add(fullName);
        }
    }

    List<String> AddressBook = new ArrayList<>();

    public List<String> addContact() {
//        List<String> AddressBook= new ArrayList<>();
        Scanner sc = new Scanner(System.in);

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

    public void searchContact(String name) {

        List<String> collectName = AddressBook.stream().filter(fName -> fName.equals(name)).collect(Collectors.toList());
        if (collectName.size() > 0) {
            System.out.println("Searched Item -> " + collectName);
        } else {
            System.out.println("No results found ...");
        }
    }

    public void editContact(String original, String replacement) {
        if (AddressBook.contains(original)) {
            int ind = AddressBook.indexOf(original);
            System.err.println("Pre-Edit -> " + AddressBook.get(ind));
            AddressBook.set(ind, replacement);
            System.err.println("Post-Edit -> " + AddressBook.get(ind));
            System.out.println(AddressBook);
        } else {
            System.err.println(original + " Does not exist in Address Book");
        }

    }

    public void countContact() {
        System.out.println("Contact Size is : " + AddressBook.size());
    }

//    Also Satisfies UC12
    public void sortContact() {
        List<String> collect = AddressBook.stream().sorted().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    public void deleteContact(String contactData) {
        if (AddressBook.contains(contactData)) {
            AddressBook.remove(contactData);
            System.err.println("Deleted -> " + contactData);
            System.out.println(AddressBook);
        } else {
            System.err.println("Address Book does not contain ->" + '"' + contactData + '"');
        }
    }
//    UC 13 to 15
}
