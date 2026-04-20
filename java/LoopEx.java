import java.util.Scanner;
public class ImpromptuTask{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
       
        int digit = inputCollector.nextInt();
        int sumOfDigit = 0;
        int singleDigit = 0;
        for (i = 0; i <= digit; i++){
            singleDigit = digit % 10;
            sumOfDigit +=  singleDigit;
            
        }
        System.out.print(sumOfDigit)
        
    }
}
