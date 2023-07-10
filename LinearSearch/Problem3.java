package LinearSearch;

//Return true if the target exist and false if not
public class Problem3 {
    public static void main(String[] args) {
        int array[] = {52, 45, 78, 56, 95, 46, 22, 34, 62, 78, 47, 90};
        int target = 22;
        boolean answer = linerSearch(array, target);
        System.out.println(answer);
    }

    static boolean linerSearch(int array[], int target) {
        if (array.length == 0) {
            return false;
        }
        for (int element : array) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
