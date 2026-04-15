import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean onNokia = true;

        while (onNokia) {

            System.out.println("--- NOKIA MENU MAP ---")
            System.out.println("1. Phone book")
            System.out.println("2. Messages")  
            System.out.println("3. Chat")       
            System.out.println("4. Call register")       
            System.out.println("5. Tones")       
            System.out.println("6. Settings")            
            System.out.println("7. Call divert")       
            System.out.println("8. Games")       
            System.out.println("9. Calculator")       
            System.out.println("10.Reminders ")       
            System.out.println("11.Clock ")       
            System.out.println("12.Profiles ")       
            System.out.println("13. Sim Services")       

            System.out.print("Select an option: ");
            int phoneBook = input.nextInt();

            switch (phoneBook) {

                case 1:
                    boolean inPhoneBook = true;

                    while (inPhoneBook) {
                        System.out.println("""
                                \nPhone book
                                1. Search
                                2. Service No
                                3. Add name	
                                4. Erase
                                5. Edit
                                6. Assign tone
                                7. Send b'card
                                8. Options
                                9. Speed dials
                                10. Voice tags
                                0. Back
                                """);

                        int phoneBookOption = input.nextInt();

                        if (phoneBookOption == 0) {
                            inPhoneBook = false;

                        } else if (phoneBookOption == 8) {
                            boolean inOptions = true;

                            while (inOptions) {
                                System.out.println("""
                                        Options:
                                        1. Type of view
                                        2. Memory status 
                                        3. Back
                                        """);

                                int phoneBookOptionTwo = input.nextInt();

                                if (phoneBookOptionTwo == 3) {
                                    inOptions = false;
                                }
                            }
                        }
                    }
                    break;  
                    
                case 2:
                    boolean inMessages = true;

                    while (inMessages) {
                        System.out.println("""
                                \nMessages
                                1. Write messages
                                2. Inbox
                                3. Outbox
                                4. Picture messages
                                5. Templates
                                6. Smileys
                                7. Message settings
                                8. Info service
                                9. Voice service
                                10. Service command editor
                                0. Back
                                """);

                        int messageSettingOption = input.nextInt();

                        if (messageSettingOption == 0) {
                            inMessages = false;

                        } else if (messageSettingOption == 7) {
                            boolean inMessageSetting = true;

                            while (inMessageSetting) {
                                System.out.println("""
                                        Message settings:
                                        1. Set 1
                                        2. Common
                                        0. Back
                                        """);

                                int messageSettingChoice = input.nextInt();

                                if (messageSettingChoice == 0) {
                                    inMessageSetting = false;

                                } else if (messageSettingChoice == 1) {
                                    boolean set1Choice = true;

                                    while (set1Choice) {
                                        System.out.println("""
                                                Set 1:
                                                1. Message center number
                                                2. Message sent as
                                                3. Message validity
                                                0. Back
                                                """);

                                        int set1Choice = input.nextInt();

                                        if (set1Choice == 0) {
                                            inMessageSettingChoiceOne = false;
                                        }
                                    }

                                } else if (messageSettingChoice == 2) {
                                    boolean inMessageSettingChoiceTwo = true;

                                    while (inMessageSettingChoiceTwo) {
                                        System.out.println("""
                                                Common:
                                                1. Delivery reports
                                                2. Reply via same center
                                                3. Character support
                                                0. Back
                                                """);

                                        int commonChoice = input.nextInt();

                                        if (commonChoice == 0) {
                                            inMessageSettingChoiceTwo = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("""
                            \nCall Register
                            1. Missed calls
                            2. Received calls
                            3. Dialed numbers
                            4. Erase recent call list
                            5. Show call duration
                            6. Show call costs
                            7. Call cost settings
                            8. Prepaid credit
                            """);

                    int callDuration = input.nextInt();

                    if (callDuration == 5) {
                        System.out.println("""
                                Show call duration:
                                1. Last call
                                2. All calls
                                3. Received
                                4. Dialled
                                5. Clear timers
                                """);
                    } else if (callDuration == 6) {
                        System.out.println("""
                                Show call costs:
                                1. Last cost
                                2. All cost
                                3. Clear counters
                                """);
                    } else if (callDuration == 7) {
                        System.out.println("""
                                Call cost settings:
                                1. Call cost limit
                                2. Show costs in
                                """);
                    }
                    break;

                case 5:
                    System.out.println("""
                            \nTones
                            1. Ringing tone
                            2. Ringing volume
                            3. Incoming call alert
                            4. Composer
                            5. Message alert tone
                            6. Keypad tones
                            7. Warning and game tones
                            8. Vibrating alert
                            9. Screen saver
                            """);
                    break;

                case 6:
                    System.out.println("""
                            \nSettings
                            1. Call settings
                            2. Phone settings
                            3. Security settings
                            4. Restore factory settings
                            """);

                    int callSettings = input.nextInt();

                    if (callSettings == 1) {
                        System.out.println("""
                                Call settings:
                                1. Redial
                                2. Speed dial
                                3. Call waiting
                                4. Own number
                                5. Line use
                                6. Auto answer
                                """);
                    } else if (callSettings == 2) {
                        System.out.println("""
                                Phone settings:
                                1. Language
                                2. Cell info
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM actions
                                """);
                    } else if (callSettings == 3) {
                        System.out.println("""
                                Security settings:
                                1. PIN request
                                2. Call barring
                                3. Fixed dialing
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                """);
                    } else if (callSettings == 4) {
                        System.out.println("Restoring factory settings...");
                    }
                    break;

                case 11:
                    System.out.println("""
                            \nClock
                            1. Alarm clock
                            2. Clock settings
                            3. Date settings
                            4. Stopwatch
                            5. Countdown timer
                            6. Auto update
                            """);
                    break;

                case 0:
                    System.out.println("Shutting down...");
                    onNokia = false;
                    break;

                default:
                    System.out.println("Invalid selection.");
                    break;
            }

            System.out.println("\n--- End of NOKIA ---\n");
        }
    }
}
