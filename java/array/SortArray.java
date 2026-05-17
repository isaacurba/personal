import java.util.Arrays;

public class SortArray {

    public static void main(String[] args){

        int[] arr = {11, 43, 34, 55, 875, 456, 5};

        for (int index = 0; index < arr.length; index++){
            for (int secondIndex = index+1; secondIndex < arr.length; secondIndex++){
                
                if (arr[index] > arr[secondIndex]){
                    
                    int temp = arr[index];
                    arr[index] = arr[secondIndex];
                    arr[secondIndex] = temp;
                }
            }
        } 
        
        System.out.print(Arrays.toString(arr));
    }
}
