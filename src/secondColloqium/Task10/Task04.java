package secondColloqium.Task10;

public class Task04 {
    public static void main(String[] args) {
        int wrt = 5;

        System.out.println("Stan zmiennej wrt przed modyfikacją: " + wrt);

        modifyValue(wrt);

        System.out.println("Stan zmiennej wrt po modyfikacji: " + wrt);
    }

    private static void modifyValue(int value) {
        System.out.println("Wartość dostarczonej zmiennej: " + value);

        value = value * 5;

        System.out.println("Wartość zmodyfikowanej zmiennej: " + value);
    }
}
