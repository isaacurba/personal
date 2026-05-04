import java.util.Scanner;
public class Total {
    
    public static void main(String... zicco){
        Scanner sc = new Scanner(System.in);
        
        int[] scores = new int[10];
        int total = 0;
        
        for (int index = 0; index < scores.length; index++){
            System.out.print("Enter the score ");
            scores[index] = sc.nextInt();
            total += scores[index];
        }
        System.out.println(scores[5]);
        System.out.print("the total is: " + total);
    }
}
