import java.time.LocalDate;

public class Date {

// ( LocalDate, LocalTime, LocalDateTime, UTC timestamp )

    public static void main(String[] args){


//        LocalDateTime time = LocalDateTime.now();
//        
//        System.out.print(time);           


        // CUSTOM FORMATTER
        
//        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
//        String newDateTime = dateTime.format(formatter);
//        
//        System.out.print(newDateTime);


    LocalDate date = LocalDate.plusDays(10);
    System.out.print(date);
   
    
    }
}
