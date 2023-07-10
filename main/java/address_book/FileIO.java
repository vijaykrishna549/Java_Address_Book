package address_book;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    File filePath = new File("C:\\Users\\pvija\\Desktop\\demo.txt");
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        FileIO fileIO = new FileIO();
        fileIO.createFile();
        fileIO.readFile();
    }

    public void createFile() {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            System.out.println("Enter your name, phone, state, city and zip code");
            String addContact = sc.nextLine();

            fileWriter.write(addContact);
            fileWriter.close();
            System.out.println("file is created successfully");
            System.out.println("file read **************************");

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void readFile() {
        try {

            FileReader fileReader = new FileReader(filePath);
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
            System.out.println("Reading of file successfully");
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
