package array;

public class Practice0001SumOfArrayElements {

    public static int sumOfArrayElementsUsingForEach(int[] array){
        int sum = 0;                    // initiating sum variable
        for (Integer i : array) {       // forEach loop
            sum = sum + i;              // iterating sum and array elements
        }
        return sum;
    }

    public static int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(sumOfArrayElementsUsingForEach(array));
        System.out.println(sumOfArrayElements(array));
    }

}
