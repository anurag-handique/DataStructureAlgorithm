package LinearSearch;

//Maximum element in a 2-D array
public class Problem9 {

    public static void main(String[] args) {
        int array[][] = new int[][]{ //A two-dimensional array
                {12, 14, 24, 3, 15},
                {36, 45, 87, 59, 21, 3, 26},
                {2, 78, 91, 52, 40, 10, 30, 9, 6},
                {13, 34, 53, 58, 61, 32, 1, 47, 62, 95, 49}
        };
        System.out.println(maximumElement(array));
//        System.out.println(Integer.MIN_VALUE);-->This will give the min value a data type can hold.
    }

    static int maximumElement(int array[][]) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] > max) {
                    max = array[row][column];
                }
            }
        }
        return max;
    }
}
