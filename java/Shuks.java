import java.util.Scanner;
public class TaskSeven{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);

        int count = 1;
        while (count <= 10){
            System.out.print("Enter a number from 1 -10: ");
            int score = inputCollector.nextInt();
            
            count++;
            
        }
    }
}

