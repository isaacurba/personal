import java.util.Arrays;

public class Practice {
    public static void main(String... urban){
        
        int[] scores = {33, 22, 34, 100};
        String[] names = {"isaac", "urban", "boluwatife", "kpomassi"}; 
        
        Arrays.sort(scores);
        Arrays.sort(names);
        
        for (int fruit : scores){
            System.out.println(fruit);
        }
        System.out.println();
        for (String name : names){
            System.out.println(name);
        }
        
        
    }
}               
