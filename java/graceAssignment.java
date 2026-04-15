// a program that displays even number from 1 - 100 then odd numbers from 1 - 100 then numbers divisible by for print 


public class graceAssignment{
    public static void main(String[] args){
    
        for (int number = 1; number <= 100; number++){
            if (number % 2 == 0) System.out.println(number + " is an even number");
            if (number % 2 != 0) System.out.println(number + " is an odd number");
            if (number % 4 == 0) System.out.println(number + " is divisible by 4 hooray");
        }
    }
}
