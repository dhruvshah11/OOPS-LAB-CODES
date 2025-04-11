package Experiment8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    // Method that throws FileNotFoundException
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);
        
        try {
            System.out.println("File contents:");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        } finally {
            fileReader.close();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the file name to read: ");
            String fileName = scanner.nextLine();
            
            readFile(fileName);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found! Please check the file name and path.");
            
        } finally {
            System.out.println("File operation attempted.");
            scanner.close();
        }
    }
}