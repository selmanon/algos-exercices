package array;

import java.util.Arrays;

public class RemoveDuplicate {


    public static void main(String args[]) {

        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
            System.out.println();

        }
    }

    /*
     * Method to remove duplicates from array in Java, without using
     * Collection classes e.g. Set or ArrayList. Algorithm for this
     * method is simple, it first sort the array and then compare adjacent
     * objects, leaving out duplicates, which is already in the result.
     */
    public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicate together
        Arrays.sort(numbersWithDuplicates);

        int result[] = new int[numbersWithDuplicates.length];

        result[0] = numbersWithDuplicates[0];

        int currentElement = numbersWithDuplicates[0];


        for(int i = 1; i < numbersWithDuplicates.length - 1; i++){


            if(numbersWithDuplicates[i] != currentElement){
                result[i] = numbersWithDuplicates[i];
            }

            currentElement = numbersWithDuplicates[i];

        }

        return result;

    }


}
