package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Practice0001CommonElementsInTwoArrays {

    public static void commonElementsInTwoArraysUsingHashSet1(int[] arr1, int[] arr2){

        // create hashsets to transfer from arrays
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

        //adding 1st array to set

        for (int element : arr1) {
            set1.add(element);
        }
        System.out.println("Set 1: "+set1);

        //adding 2nd array to set
        for (int element: arr2) {
                set2.add(element);
        }
        System.out.println("Set 2: " + set2);

        //iterating the 1st set
        //checking the common elements
        //adding to 3rd set
        for (Integer element : set1){
            if(set2.contains(element)){
                set3.add(element);
            }
        }

        System.out.println(set3);

    }

    public static void findCommonElementsUsingStreams(int[] arr1, int[] arr2){


    }



    public static void main(String[] args) {
        int[] a = {1,4,3,6,7,2};
        int[] b = {2,5,6,1};
        commonElementsInTwoArraysUsingHashSet1(a,b);
        findCommonElementsUsingStreams(a,b);

    }

}
