package LinearSearch;

//Searching characters within a particular index range;
public class Problem5 {
    public static void main(String[] args) {
        //For String
        String str = "India";
        char target = 'i';
        System.out.println(linearSearch2(str, target, 1, 4));
        //For Array
        int arr[] = {14, 55, 63, 12, 47, -21, -16, 37};
        int targetElement = -21;
        System.out.println(linearArraySearch(arr, targetElement, 3, 6));


    }

    public static boolean linearSearch2(String str, char target, int start, int end) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = start; i < end; i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    //For array range searching
    public static boolean linearArraySearch(int arr[], int targetElement, int start, int end) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (targetElement == element) {
                return true;
            }
        }
        return false;
    }


}

