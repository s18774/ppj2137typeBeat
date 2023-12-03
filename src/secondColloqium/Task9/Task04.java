package secondColloqium.Task9;

public class Task04 {
    public static void main(String[] args) {
        int[] arr = {153, 333, 370, 515, 407, 80, 2137, 89,99,100,21,407};

        System.out.println("Liczby Armstronga w tablicy:");

        for (int number : arr) {
            if (isArmstrongNumber(number)) {
                System.out.print(number+", ");
            }
        }
    }

    private static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int numDigits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }

    private static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}
