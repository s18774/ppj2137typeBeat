package secondColloqium.Task9;

public class Task03 {
    public static void main(String[] args) {
        int[] sortedArray = {1, 1, 2, 3, 3, 4, 5, 5, 5, 5, 6, 7, 9, 10, 10};

        int uniqueValuesCount = countUniqueValues(sortedArray);

        System.out.print("tablica na samym początku:  ");
        for (int element : sortedArray) {
            System.out.print(" " + element);
        }
        System.out.println("\nLiczba różnych wartości w tablicy: " + uniqueValuesCount);
    }

    private static int countUniqueValues(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int uniqueValuesCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueValuesCount++;
            }
        }

        return uniqueValuesCount;
    }
}
