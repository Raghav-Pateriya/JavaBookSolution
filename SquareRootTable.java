import java.lang.Math;

public class RootTable {
    public static void main(String[] args) {
        // Print the column headers (0.0 to 0.9)
        System.out.print("Number ");
        for (int i = 0; i <= 9; i++) {
            System.out.print("0." + i + "      ");
        }
        System.out.println();

        // Nested loops to dynamically build rows 0.0 through 9.0
        for (int row = 0; row <= 9; row++) {
            // Print the row header (e.g., 0.0, 1.0, 2.0...)
            System.out.print(row + ".0    ");
            
            for (int col = 0; col <= 9; col++) {
                // Calculate the specific value (e.g., 1.0 + 0.3 = 1.3)
                float value = row + (col * 0.1f);
                float squareRoot = (float) Math.sqrt(value);
                
                // Format output to 4 decimal places to keep the table clean
                System.out.printf("%.4f   ", squareRoot);
            }
            System.out.println();
        }
    }
}
