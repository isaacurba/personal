import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number to get the factorial: ");
        int num = input.nextInt();
        long factorial = 1; // Use long to prevent overflow for numbers 

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + "! is: " + factorial);
    }
}

