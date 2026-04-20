import java.util.Scanner;
public class DigitSquared{
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to get the square: ");
        int number = input.nextInt();
        
        int lastDigit = 0;
        int digitSquared = 1;
        
        for (; number > 0;){
            lastDigit = number % 10;
            digitSquared = digitSquared * lastDigit;
//            eachDigitSquared = eachDigitSquared * 100;
            
            number /= 10;
        }
        
        System.out.println(digitSquared);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
