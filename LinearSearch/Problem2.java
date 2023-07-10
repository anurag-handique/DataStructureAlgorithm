package LinearSearch;

//Return the target array element
public class Problem2 {
    public static void main(String[] args) {
        int arr[] = {52, 45, 78, 56, 95, 46, 22, 34, 62, 71};
        int target = 788;
        int targetElement = linerSearch(arr, target);
        System.out.println(targetElement);

    }

    public static int linerSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
        //-1 is not returned because it can be one of the array element
    }
}
