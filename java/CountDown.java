import java.util.Scanner;
public class CountDown{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the nuber to count down to: ");
        int number = input.nextInt();

        for (int i = number; i >= 1; i--){
            System.out.println(i    );
        }        
        System.out.print("FINISHED!!!!");

    }
}
