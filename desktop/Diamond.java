public class Diamond {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Inner loop 1: Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Inner loop 2: Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

