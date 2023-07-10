package LinearSearch;

/*
   The worst case time complex. for Linear searching is Big O(n)>>don't find the element
   Whereas the best time complexity for Linear searching is O(1)
-->Because in best case it will compare only one element atmost because the element is present in the
   Oth index.It doesn't depend on the size of the array.
-->In worst case , time complexity depends on the size of the array because for eg-
   array size = 200, it will itrate through all the 200 elements.
 */
public class Problem1 {

    public static void main(String[] args) {

        int array[] = {24, 45, 55, 61, -42, 1, 8, 99, 35};
        int target = -42;
        int answer = linearSearch(array, target);
        System.out.println(answer);


    }

    //Search in the array:return the index if item found
    // otherwise if not found return-1
    public static int linearSearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }


}
