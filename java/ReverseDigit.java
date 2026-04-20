import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to be reversed: ");
        int number = input.nextInt();

        int lastDigit;
        int reverseDigit = 0;

        while (number > 0) {
            lastDigit = number % 10;
            reverseDigit = reverseDigit * 10 + lastDigit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reverseDigit);

    }
}
