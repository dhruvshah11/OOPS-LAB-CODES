package Experiment3;

/**
 * Question: Write a Java program to print a specific pattern using symbols.
 *
 * Problem Statement:
 * - Create a program that prints a pyramid pattern using # and ? symbols
 * - Pattern should be 4 rows high
 * - Odd-numbered rows use ? symbols
 * - Even-numbered rows use # symbols
 * - Each row should be properly centered
 * - Number of symbols in each row follows the pattern: 1,3,5,7
 *
 * Expected Pattern:
 * ?      
 * # # #    
 * ? ? ? ? ?  
 * # # # # # # #
 *
 * Learning Objectives:
 * - Nested loops
 * - Pattern logic
 * - Space formatting
 * - Symbol alternation
 */
public class PatternPrinting {
    public static void main(String[] args) {
        // Number of rows in pattern
        int rows = 4;
        
        // Loop for each row
        for (int i = 0; i < rows; i++) {
            // Calculate number of symbols for current row
            int symbols = 2 * i + 1;
            
            // Print spaces for alignment
            for (int space = 0; space < (7 - symbols) / 2; space++) {
                System.out.print("  ");
            }
            
            // Print symbols
            for (int j = 0; j < symbols; j++) {
                // Alternate between ? and # for each row
                if (i % 2 == 0) {
                    System.out.print("? ");
                } else {
                    System.out.print("# ");
                }
            }
            
            // Move to next line
            System.out.println();
        }
    }
}