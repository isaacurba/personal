public class Range {

    public static void main(String... minnie){
        
        int[] input = {2, 5, 7, 9, 20};
        
        System.out.print(range(input));
         
        
    }
    
    public static int range(int[] arr){
        int largest = arr[0];
        int smallest = arr[0];
        
        for(int index = 0; index <= arr.length; index++){
            
            if (arr[0] > largest){
                largest = arr[0];
            }
            if (arr[0] < smallest){
                smallest = arr[0];
            }
        }
        
        
        return largest - smallest;
    }
    
}
