package LinearSearch;

public class Problem10 {
    //Find the number of even digit element present in the array?
    public static void main(String[] args) {
        int array[] = {12, 345, 2, 6, 7896, 34, 40, 10};
        int answer = countEvenNumbersOfElements(array);
        System.out.println(answer);


    }

    static boolean isEvenNumber(int number) {//Check even or not
        int evenDigitCount = 0;
        while (number != 0) {
            evenDigitCount++;
            number = number / 10;

        }
        return evenDigitCount % 2 == 0;
    }

    static int countEvenNumbersOfElements(int array[]) {//Count elements having even number of Digits
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEvenNumber(array[i])) {
                count++;
            }
        }
        return count;
    }
}