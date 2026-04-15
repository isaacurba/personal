public class Ppp{
    public static void main(String[] args){
        String character = "*";
        for (int i = 1; i <= 10; i++){
        
            for (int j = 1; j <= i; j++){
                System.out.print(character);
            }
            
            System.out.println();
        }
    }
}
