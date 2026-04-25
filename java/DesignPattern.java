import java.util.Scanner;

public class DesignPattern{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        
        for (int count = 1; count <= rows; count++){
            
//            for (int space = 1; space <= rows - count; space++) System.out.print(" ");
            
            for (int counter = 1; counter <= count; counter++){
                System.out.println("*");
                System.out.print("|");
            } 
            
            System.out.println();
        }
    
    }
}

