package BinarySearch;

//Order Agnostic Binary Search(To know the shorting of the array)
public class Problem3 {

    public static void main(String[] args) {
        int array[] = {-16, -12, -11, 0, 8, 12, 13, 16, 21, 18, 45, 99, 102, 203};
        int target = 99;
        int answer = orderAgnosticBinarySearch(array, target);//Passing the array and target to method
        System.out.println(answer);
    }

    public static int orderAgnosticBinarySearch(int array[], int target) {
        int start = 0;
        int end = array.length - 1;

        //Find array is in Ascending order or Descending order

        boolean isAscending = array[start] < array[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {//For target element == mid element
                return mid;
            }
            if (isAscending) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            } else {//For descending
                if (target < array[mid]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;

                }

            }

        }
        return -1;
    }
}
