/**
 * Question: Grade Sheet Formatting with Special Characters
 *
 * Create a Java program that generates a visually appealing grade sheet using
 * console output formatting techniques. The program should demonstrate the use
 * of escape sequences and special characters for text alignment.
 *
 * Requirements:
 * 1. Display a formatted grade sheet with:
 *    - Student details (Name, Roll Number, SAP ID)
 *    - Subject-wise marks and grades
 *    - Overall result
 * 2. Use appropriate formatting elements:
 *    - Borders using special characters
 *    - Proper alignment using tabs and spaces
 *    - Clear section separation
 * 3. Implement proper spacing and alignment for readability
 *
 * Learning Objectives:
 * - Working with escape sequences (\t, \n)
 * - Text formatting and alignment
 * - Using special characters for borders
 * - String concatenation
 * - Console output formatting
 */
public class GradeSheet {
    public static void main(String[] args) {
        // Define student information
        String name = "dhruv shah";
        String rollNumber = "R2142230789";
        String sapId = "500119876";
        String result = "PASS";
        
        // Create a visually appealing grade sheet using escape sequences and special characters
        System.out.println("\n\t\t*******************************************");
        System.out.println("\t\t*                                         *");
        System.out.println("\t\t*        CBSE GRADE SHEET 2023-24        *");
        System.out.println("\t\t*                                         *");
        System.out.println("\t\t*******************************************");
        System.out.println("\t\t*                                         *");
        System.out.println("\t\t*  Name       : " + name + "\t  *");
        System.out.println("\t\t*  Roll Number: " + rollNumber + "\t\t  *");
        System.out.println("\t\t*  SAP ID     : " + sapId + "\t\t  *");
        System.out.println("\t\t*                                         *");
        System.out.println("\t\t*******************************************");
        System.out.println("\t\t*                                         *");
        System.out.println("\t\t*  Subject\t\tMarks\tGrade\t  *");
        System.out.println("\t\t*  ---------\t\t-----\t-----\t  *");
        System.out.println("\t\t*  Mathematics\t\t95\tA+\t  *");
        System.out.println("\t\t*  Physics\t\t88\tA\t  *");
        System.out.println("\t\t*  Computer Science\t92\tA+\t  *");
        System.out.println("\t\t*                                         *");
        System.out.println("\t\t*******************************************");
        System.out.println("\t\t*                                         *");
        System.out.println("\t\t*  Overall Result: " + result + "\t\t\t  *");
        System.out.println("\t\t*                                         *");
        System.out.println("\t\t*******************************************\n");
    }
}