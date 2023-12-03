package secondColloqium.Task10;
public class Task05 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 8745;
        int num3 = 283;

        int max = findMax(num1, num2, num3);

        System.out.println("Największa wartość: " + max);
    }

    private static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
