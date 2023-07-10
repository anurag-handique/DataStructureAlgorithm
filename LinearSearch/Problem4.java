package LinearSearch;

//String searching
public class Problem4 {
    public static void main(String[] args) {
        String str = "Anurag";
        char target = 'z';
        boolean answer = linearSearch(str, target);
        System.out.println(answer);
    }

    public static boolean linearSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
