package address_book;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ContactFromCSV {
    String filepath = "C:\\Users\\pvija\\Desktop\\demo.csv";

    public static void main(String[] args) {
        ContactFromCSV contactFromCSV = new ContactFromCSV();
//        contactFromCSV.createContactFromCSV();
        contactFromCSV.readContactFromCSV();
    }

    public void createContactFromCSV() {
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(filepath))) {
            String[] header = {"Name", "Email", "Address", "PhoneNumber"};
            csvWriter.writeNext(header);
            String[] values = {"Vijay", "abc@gmail.com", "Patna", "987654321"};
            csvWriter.writeNext(values);
            System.out.println("CSV file is created successfully...");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readContactFromCSV() {
        CSVReader reader = null;
        try {
//parsing a CSV file into CSVReader class constructor
//            String filepath = "C:\\Users\\pvija\\Desktop\\demo.csv";
            reader = new CSVReader(new FileReader(filepath));
            String[] nextLine;
//reads one line at a time
            while ((nextLine = reader.readNext()) != null) {
                for (String token : nextLine) {
                    System.out.print(token);
                }
                System.out.print("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
