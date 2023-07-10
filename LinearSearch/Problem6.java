package LinearSearch;

//minimum element in the array
public class Problem6 {

    public static void main(String[] args) {
        int array[] = {20, 16, 14, 12, 10, 8, 6, 32, 40, 49};
        System.out.println("The min element in the array is: "+result(array));
    }

    static int result(int array[]) {
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }
}

