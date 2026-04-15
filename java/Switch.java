import java.util.Scanner;
public class Switch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);        
        
        System.out.print("Enter day: ");
        String day = scanner.nextLine();
    
        switch(day){
            case "Monday", "Tuesday", "Wedneday", "Thursday", "Friday" -> 
                System.out.println("Its Weekday");
            case "Saturday", "Sunday" -> 
                System.out.print("Its Weekdend");
            default -> System.out.print(day + " is not a day");
        }
        
    }
}
