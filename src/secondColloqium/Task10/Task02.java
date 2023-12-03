package secondColloqium.Task10;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int[][] inputArray = generateRandomArray(8, 26);

        System.out.println("Tablica wejściowa:");
        printArray(inputArray);

        int[][] newArray = removeDuplicatesInRows(inputArray);
        System.out.println("\nNowa tablica po usunięciu duplikatów z każdego wiersza:");
        printArray(newArray);
    }

    //metoda do zapełniania tablicy wartościami
    private static int[][] generateRandomArray(int rows, int cols) {
        Random random = new Random();
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        return array;
    }

    // usuwanie duplikatów
    private static int[][] removeDuplicatesInRows(int[][] inputArray) {
        int rows = inputArray.length;

        int[][] newArray = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int uniqueCount = countUniqueValues(inputArray[i]);
            newArray[i] = new int[uniqueCount];
            copyUniqueValues(inputArray[i], newArray[i]);
        }

        return newArray;
    }

    // zliczanie unikalnych wartości
    private static int countUniqueValues(int[] array) {
        int uniqueCount = 1;

        for (int i = 1; i < array.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    // wstawiamy niepowtarzające się wartości do tablicy
    private static void copyUniqueValues(int[] source, int[] destination) {
        destination[0] = source[0];
        int index = 1;

        for (int i = 1; i < source.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (source[i] == source[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                destination[index++] = source[i];
            }
        }
    }

    //wyświetlanie tablicy
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
