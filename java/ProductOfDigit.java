import java.util.Scanner;

public class ProductOfDigit{
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to get the product of all digit ");
        int number = input.nextInt();

        int eachDigit;
        int productOfDgit = 1;

        while (number > 0) {
            eachDigit = number % 10;
            productOfDgit = productOfDgit * eachDigit;
            number /= 10;
        }

        System.out.printf("The product of all digit is %d", productOfDgit);

    }
}
