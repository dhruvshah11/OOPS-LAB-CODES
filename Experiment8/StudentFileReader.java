package Experiment8;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentFileReader {
    public static void main(String[] args) {
        try {
            // Create FileReader object
            FileReader fr = new FileReader("student.txt");
            BufferedReader reader = new BufferedReader(fr);
            
            System.out.println("Reading student records from file:\n");
            String line;
            
            // Read file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            reader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt file not found!");
            System.out.println("Please make sure the file exists in the current directory.");
            
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}