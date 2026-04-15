import java.util.Scanner;
public class ReversePattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the character to print in reverse pattern: ");
        String character = input.nextLine();

        
        for (int i = 10; i >= 1; i--){
        
            for (int j = 10; j >= i; j--){
                System.out.print(character);
            }
          System.out.println();
        }
    }
}
