package LinearSearch;

import java.util.Arrays;

//Linear Search in 2D array.
//Search the target element in the array

public class Problem7 {
    public static void main(String[] args) {

        int array[][] = new int[][]{ //A two-dimensional array
                {12, 14, 24, 3, 15},
                {36, 45, 87, 59, 21, 3, 26},
                {2, 78, 91, 52, 40, 10, 30, 9, 6},
                {13, 34, 53, 58, 61, 32, 1, 47, 62, 95, 47}
        };

        int target = 30;
        int[] answer = searchElement(array, target);//Returning the answer in row and column format;
        System.out.println(Arrays.toString(answer));

    }

    static int[] searchElement(int array[][], int target) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] == target) {
                    return new int[]{row, column};//This will basically give a new array
                }
            }
        }
        return new int[]{-1, -1};//Considering that -1 is not present in the array ;
    }
}