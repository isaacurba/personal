public class SumOfNumbers {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};  

        int result = sumArray(numbers);   

        System.out.println(result);
    }

    public static int sumArray(int[] array) {
        int total = 0;
        for (int index = 0; index < array.length; index++){
            total += array[index];
        }
        return total;
    }
}
