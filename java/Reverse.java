import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to print the square of last digit: ");
        int number = input.nextInt(); 
        
        int lastDigit = 0;
        int reverseDigit = 0;
        
        while (number > 0){
            lastDigit = number % 10;
            reverseDigit = (lastDigit * 10) + lastDigit;
            number /= 10;
            reverseDigit += lastDigit;
        }
        System.out.print(reverseDigit);
    }
}
