package address_book;

import java.util.Scanner;

public class AddressMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        Scanner sc = new Scanner(System.in);
//        List<String> AddressBook= new ArrayList<>();

        CreateContact cr = new CreateContact();

        boolean flag = true;
//This While loop satisfies to add multiple persons to address book
        while (flag) {
            switch (cr.displayOption()) {
                case 1 -> {
                    System.out.println("Enter full name");
                    String name = sc.nextLine();
                    cr.checkDuplicateName(name);
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
    }


}
