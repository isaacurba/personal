import java.util.Scanner;

public class CountDigit{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to count the digits: ");
        int number = input.nextInt();

        int count = 0;
        int eachDigit;

        while (number > 0) {
            eachDigit = number % 10;
            count++;
            number /= 10;
        }

        System.out.printf("There are %d digit", count);
    }
}
