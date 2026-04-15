import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        

        double count = 0;         
        double total = 0;

        for (int i = 1; i <= 10; i++){
            
            System.out.printf("Enter score %d: ", i);
            int score = input.nextInt();    

            total += score;
            count += 1;
        }

            double average = total / count;
            System.out.print("the average score is: " + average);
        
    }
}
