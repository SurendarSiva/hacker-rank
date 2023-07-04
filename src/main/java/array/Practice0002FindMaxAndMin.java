package array;

public class Practice0002FindMaxAndMin {

    public static int findMaxValue(int[] array){
        int maximum = array[0];
        for (int i : array){
            if (i > maximum){
                maximum = i;
            }
        }
        return maximum;
    }

    public static int findMinValue(int[] array){
        int minimum = array[0];
        for (int i : array){
            if (i < minimum){
                minimum = i;
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(findMaxValue(array));
        System.out.println(findMinValue(array));
    }

}
