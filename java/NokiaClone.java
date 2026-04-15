import java.util.Scanner;
public class NokiaClone{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
            boolean onkiaOn = true;
            
            while (onkiaOn){ 
                System.out.println("Power on......");
                System.out.println("--- NOKIA MENU MAP ---");
                System.out.println("1. Phone book");
                System.out.println("2. Messages");
                System.out.println("3. Chat");     
                System.out.println("4. Call register");    
                System.out.println("5. Tones");       
                System.out.println("6. Settings");            
                System.out.println("7. Call divert");       
                System.out.println("8. Games");       
                System.out.println("9. Calculator");       
                System.out.println("10.Reminders ");       
                System.out.println("11.Clock ");       
                System.out.println("12.Profiles ");       
                System.out.println("13. Sim Services");                   
                System.out.println("0. Terminate");   
                
                System.out.print("Select an option: ");
                int inNokia = inputCollector.nextInt();
                
                switch (inNokia){ //Turning on the nokia menu
                    
                    case 1:                    
                        boolean inPhoneBook = true;
                        while (inPhoneBook){
                                System.out.println("--- Phone book ---");
                                System.out.println("1. Search");
                                System.out.println("2. Service Nos");
                                System.out.println("3. Add name");     
                                System.out.println("4. Erase");    
                                System.out.println("5. Edit");       
                                System.out.println("6. Assign tone");            
                                System.out.println("7. Send b'card");       
                                System.out.println("8. Options");       
                                System.out.println("9. Speed dials");       
                                System.out.println("10.Voice tags "); 
                                System.out.println("0. Back"); 
                                System.out.print("Select an option: ");
                                
                                int phoneBookOption = inputCollector.nextInt();
                                if (phoneBookOption == 0){
                                    inPhoneBook = false;
                                }
                                else if (phoneBookOption == 8){
                                
                                    boolean inPhoneBookOption = true;
                                    while (inPhoneBookOption){                  
                                        System.out.println("--- Options ---");       
                                        System.out.println("1. Type of view"); 
                                        System.out.println("2. Memory status");
                                        System.out.println("0. Back");    
                                        
                                        if (inPhoneBookOptionChoice == 0){
                                            inPhoneBookOption = false;
                                        }  
                                    } 
  
                                }
                                
                        }                        
                        break;
                        
                    case 2:
                        break;
                        
                    case 3:
                        break;
                        
                     case 4:
                        break;
                        
                     case 5:
                        break;
                        
                    case 6:
                        break;
                        
                    case 7:
                        break;
                        
                    case 8:
                        break;
                        
                    case 9:
                        break;
                        
                    case 10:
                        break;
                        
                    case 11:
                        break;
                        
                    case 12:
                        break;
                        
                    case 13:
                        break;

                    case 0: 
                        onkiaOn = false; 
                        break;                        
                        
                    default:
                        System.out.println("--- Invalid input ---");                      
                        
                        
                }
                System.out.print("Power off.....");
            
            }// end of phonebook loop
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    }
}
