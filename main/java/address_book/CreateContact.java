package address_book;

import java.util.ArrayList;
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

    //
//    public CreateContact() {
//
//    }
//
//    public String getFullname(){
//        return this.fullName;
//    }
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//    public String getPhone(){
//        return this.phone;
//    }
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//    public String getState(){
//        return this.state;
//    }
//    public void setState(String state) {
//        this.state = state;
//    }
//    public String getCity(){
//        return this.city;
//    }
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getZip(){
//        return this.zip;
//    }
//    public void setZip(String zip) {
//        this.zip = zip;
//    }
    List<String> AddressBook = new ArrayList<>();

    public List<String> addContact() {
//        List<String> AddressBook= new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = sc.nextLine();
        AddressBook.add(fullName);

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

        return AddressBook;

    }
    public void getFullDetails() {
        CreateContact csr = new CreateContact();
        System.out.println("get full details");
        System.out.println(AddressBook + "Address Book");

//        System.out.println(csr.addContact().iterator());
//        for (String s : csr.addContact()) {
//            System.out.println(s);
//        }

//        System.out.println("Full name : "+ this.fullName+ ", Phone number: "  + this.phone +", State : "+ this.state +", City : "+ this.city  + ", Zip code : "+ this.zip);
//        return this.fullName  + this.phone + this.state + this.city  + this.zip;
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
            System.err.println("Index out of Bounds");
        }

//        if(index >= AddressBook.size() || index < 0){
//            //index does not exists
//            System.err.println("Index out of Bounds");
//
//        }else{
//            System.out.println("Pre-Edit -> "+AddressBook.get(index));
//            AddressBook.set(index, replacement);
//            System.out.println("Post-Edit -> "+AddressBook.get(index));
//            System.out.println(AddressBook);
//            // index exists
//        }
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
