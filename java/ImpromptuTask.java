import java.util.Scanner;
public class ImpromptuTask{
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any Digit number to print the sum: ");
        int number = input.nextInt();
        
        int sumOfDigit = 0;
        
        while (number > 0){
            int lastDigit = number % 10;
            sumOfDigit += lastDigit;
            number /= 10;
        }
        
        System.out.print(sumOfDigit);
        
    }
}
