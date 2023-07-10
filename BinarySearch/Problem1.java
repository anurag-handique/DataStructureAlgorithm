package BinarySearch;

/*
Binary Search->>Binary search is defined as a searching algorithm used in a sorted array by repeatedly-
-dividing the search interval in half.The idea of the binary search is to use the information that
 array is shorted and reduced the time complexity to 0 (logN).(Average time complexity)-where N is
 the size of the array.
 Steps involved-
                 1.Take start and end points.
                 2.Find the middle element-Formula-->start+(end -start)/2;
                 3.In increasing order(ascending)-If target>middle search in right else left.
                 4.If the mid element == target-->>Answer
                 5.If start>end : element not found in the array.


                 *Best Case Time Complexity-when the first middle value is = target element.ie-0(1).
                 *Worst Case Time Complexity-the worst case occurs, when we have to keep reducing
                   the search space till it has only one element.
 */
//Find the index of the target element in the ascending order array.
public class Problem1 {
    public static void main(String[] args) {

        int array[] = {-16, -12, -11, 0, 8, 12, 13, 16, 21, 18, 45, 99, 102, 203};
        int target =99;
        int answer = binarySearch(array, target);
        System.out.println(answer);


    }

    static int binarySearch(int array[], int target) {
        int start = 0;
        int end = array.length - 1;

        //find the middle element
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {//search in left
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;

            } else {
                return mid;//Answer found
            }
        }
        return -1;//If not found
    }

}
