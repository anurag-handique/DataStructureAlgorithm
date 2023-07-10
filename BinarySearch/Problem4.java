package BinarySearch;

//Find the ceiling element in the array.
//ceiling = smallest number greater than equal to target.
public class Problem4 {

    public static void main(String[] args) {
        int array[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;//4 is not present in the array so smallest number greater than target =5;
        int answer = ceiling(array, target);
        System.out.println(answer);


    }

    static int ceiling(int array[], int target) {
        //if the target element is greater than greatest element in the array than return -1
        if (target > array.length - 1) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return start;
    }
}
