import java.util.Arrays;

public class MixedArray {
    public static void main(String[] args) {
        // Declare a 3x3 Object array
        Object[][] grid = new Object[3][3];

        // Fill it with different types
        grid[0][0] = "User ID";   // String
        grid[0][1] = 101;         // Integer
        grid[0][2] = true;        // Boolean

        grid[1][0] = 95.5;        // Double
        grid[1][1] = 'A';         // Character
        grid[1][2] = 2024L;       // Long

        // You can even put another array inside a cell if you wanted!
//        grid[2][0] = "Status";
//        grid[2][1] = "Active";
//        grid[2][2] = 0;

        // Printing a value (requires casting if you want to use type-specific methods)
        String name = (String) grid[0][0]; 
//        System.out.println("Value at [0][0]: " + name);
        System.out.println(Arrays.deepToString(grid));
    }
}

