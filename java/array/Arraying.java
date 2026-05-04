import java.util.Arrays;

public class Arraying {
    public static void main(String... urban){
        
        char[][] shars = new char[3][3];
        shars[0][0] = 'x';
        shars[0][1] = 'o';
        shars[0][2] = 'x';
        
        shars[1][0] = 'o';
        shars[1][1] = 'x';
        shars[1][2] = 'x';
        
        shars[2][0] = 'x';
        shars[2][1] = 'x';
        shars[2][2] = 'o';
        
        for (char[] shar : shars){
            System.out.println (shar);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (shars[i][j] == 'x') System.out.print(1);
                else System.out.print(0);
            }
            System.out.println(); 
        }

        
        System.out.print(Arrays.deepToString(shars));
        
        
    }
}          
