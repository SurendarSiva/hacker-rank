import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 5, 6, 7};

        // Create a set to store the common elements.
        Set<Integer> commonElements = new HashSet<>();

        // Iterate through the first array and add the elements to the set if they are also present in the second array.
        for (int element : array1) {
            if (Arrays.asList(array2).contains(element)) {
                commonElements.add(element);
            }
        }

        // Print the common elements.
        System.out.println("The common elements are: " + commonElements);
    }
}