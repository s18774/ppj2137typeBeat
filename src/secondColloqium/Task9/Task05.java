package secondColloqium.Task9;

public class Task05 {
    public static void main(String[] args) {
        int[] xCoordinates = {2, 5, 8, 3, 7};
        int[] yCoordinates = {4, 1, 6, 9, 2};

        int minX = findMin(xCoordinates);
        int minY = findMin(yCoordinates);
        int maxX = findMax(xCoordinates);
        int maxY = findMax(yCoordinates);

        int centerX = (minX + maxX) / 2;
        int centerY = (minY + maxY) / 2;
        int width = maxX - minX;
        int height = maxY - minY;

        System.out.println("Współrzędne środka: (" + centerX + ", " + centerY + ")");
        System.out.println("Szerokość prostokąta: " + width);
        System.out.println("Wysokość prostokąta: " + height);
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
