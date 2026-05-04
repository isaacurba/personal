import java.util.Scanner;

public class SumOfPrimeFactor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to get the sum of its prime factors: ");
        int number = input.nextInt();
        
        // We'll store the original number to display later if needed
        int tempNumber = number;
        int primeSum = 0;

        // 1. Handle the factor 2 specifically (the only even prime)
        while (number % 2 == 0) {
            primeSum += 2;
            number /= 2;
        }

        // 2. Handle odd factors starting from 3
        // We only need to check up to the square root of the number
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                primeSum += i;
                number /= i;
            }
        }

        // 3. If number is still > 2, the remaining number is a prime factor
        if (number > 2) {
            primeSum += number;
        }

        System.out.println(primeSum);
    }
}
