package BinarySearch;

public class Problem2 {

    //Find the target element index in the shorted array of descending order.
    public static void main(String[] args) {
        int array[] = {505, 452, 212, 103, 98, 45, 28, 20, 10, 0, -14, -16, -22, -100};
        int target = -14;

        int answer = binarySearch(array, target);//Passing the array and target to method binarySearch
        System.out.println(answer);


    }

    public static int binarySearch(int array[], int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {//search in right
                start = mid + 1;

            } else if (target > array[mid]) {//search in left
                end = mid - 1;

            } else {
                return mid;//Answer
            }


        }
        return -1;//When the target is not found in the array.
    }
}
