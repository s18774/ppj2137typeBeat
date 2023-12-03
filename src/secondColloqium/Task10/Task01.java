package secondColloqium.Task10;

public class Task01 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };

        int[] flattenedArray = flattenArray(tab);

        System.out.print("Tablica jednowymiarowa: ");
        for (int value : flattenedArray) {
            System.out.print(value + " ");
        }
    }

    private static int[] flattenArray(int[][] array) {
        // Obliczamy długość dla tablicy jednowymiarowej
        int totalLength = 0;
        for (int i = 0; i < array.length; i++) {
            totalLength += array[i].length;
        }

        //inicjalizacja tablicy jednowymiarowej
        int[] flattenedArray = new int[totalLength];

        //kopiujemy do tablicy 1wymiarowej
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                flattenedArray[index++] = array[i][j];
            }
        }

        return flattenedArray;
    }
}
