import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the character to print the pattern: ");
        String character = input.nextLine();

        
        for (int i = 1; i <= 10; i++){
        
            for (int j = 1; j <= i; j++){
                System.out.print(character);
            }
          System.out.println(character);
        }
    }
}
