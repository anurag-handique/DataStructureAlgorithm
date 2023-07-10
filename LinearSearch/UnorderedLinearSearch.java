package LinearSearch;

//    Searching is a process of finding and item with specified properties among a collection of items.
//    The items can be stored as records in databases,elements in arrays ,text in files, nodes in trees.

//This is a problem related to un-ordered liner search-in a given array-[10, 50, 30, 70, 80, 20, 90, 40] and the elements are not shorted.
//We have to find 30 in the array and return its index.If not found Return "No match Found".

public class UnorderedLinearSearch {

    public static void main(String[] args) {
        int[] array = {10, 50, 30, 70, 80, 20, 90, 40};
        int key = 30;

        int index = linearSearch(array, key);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("No match found");
        }
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
