package BinarySearch;

//Find the floor target element in the given array.
//Floor =greatest no <=target.
public class Problem5 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 16, 24, 32, 40};
        int target = 5;//target is not present in the array so ans= 4 index=1;
        System.out.println(floor(arr, target));

    }

    public static int floor(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
