package Experiment3;

/**
 * Program to print a pattern of # and ? symbols
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