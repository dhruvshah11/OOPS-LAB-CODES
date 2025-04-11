/**
 * Program to design a visually appealing gradesheet using escape sequences and special characters
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