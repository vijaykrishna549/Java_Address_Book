package address_book;

import java.util.Scanner;

public class AddressMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        Scanner sc = new Scanner(System.in);
//        List<String> AddressBook= new ArrayList<>();

        CreateContact cr = new CreateContact();

        boolean flag = true;

        while (flag) {
            switch (cr.displayOption()) {
                case 1 -> {
                    cr.addContact();
                }
                case 2 -> cr.getFullDetails();
                case 3 -> {
                    System.out.println("Enter item to be edited");
                    String org = sc.next();
                    System.out.println("Enter the replacement Item");
                    String rep = sc.next();
                    cr.editContact(org, rep);
                }
                case 4->{
                    System.out.println("Enter Item to be deleted");
                    String  del = sc.next();
                    cr.deleteContact(del);
                }
                case 5 -> flag = false;
                default -> System.out.println("Invalid entry");
            }

        }


//
//        System.out.println("Enter your full name");
//        String fullName = sc.nextLine();
//        AddressBook.add(fullName);
//
//        System.out.println("Enter your Phone");
//        String phone = sc.next();
//        AddressBook.add(phone);
//
//        System.out.println("Enter your State");
//        String state = sc.next();
//        AddressBook.add(state);
//
//
//        System.out.println("Enter your City");
//        String city = sc.next();
//        AddressBook.add(city);
//
//
//        System.out.println("Enter your zip code");
//        String zipCode = sc.next();
//        AddressBook.add(zipCode);


//        CreateContact cr = new CreateContact(fullName,phone,state,city,zipCode);
//        System.out.println(cr.getFullName());
//        CreateContact cr = new CreateContact();
//        cr.setFullName(fullName);
//        cr.setPhone(phone);
//        cr.setState(state);
//        cr.setCity(city);
//        cr.setZip(zipCode);

//        cr.getFullDetails();
//        System.out.println(AddressBook);

    }


}
