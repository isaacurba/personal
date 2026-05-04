//import java.util.Arrays;

public class Array {
    public static void main(String... armstrong) {
        char[][] shars = new char[3][3];
        shars[0][0] = 'x';
        shars[0][1] = 'o';
        shars[0][2] = 'x';
        
        shars[1][0] = 'o';
        shars[1][1] = 'o';
        shars[1][2] = 'o';
        
        shars[2][0] = 'x';
        shars[2][1] = 'x';
        shars[2][2] = '0';
        
//        System.out.println(Arrays.deepToString(shars));

        for (int i = 0; i < shars.length; i++){
            for (int j = 0; j < shars.length; j++){
                System.out.print(j);   
            }
        }
    }
}

