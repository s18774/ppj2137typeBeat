package secondColloqium.Task11;

public class Task01 {

    // Statyczna i finalna zmienna rzeczywista opisująca liczbę Pi
    public static final double PI = 3.141592653589793;

    // Metoda statyczna i rezultatowa calculateCircleArea
    // przyjmuje promień koła i zwraca pole powierzchni tego koła
    public static double calculateCircleArea(double radius) {
        // Oblicz pole powierzchni koła ze wzoru: π * r^2
        return PI * Math.pow(radius, 2);
    }

    // Przykładowe użycie klasy MathOperations
    public static void main(String[] args) {
        // Przykładowe dane - promień koła
        double radius = 5.0;

        // Obliczenie pola powierzchni koła i wydrukowanie wyniku
        double circleArea = Task01.calculateCircleArea(radius);
        System.out.println("Pole powierzchni koła o promieniu " + radius + " wynosi: " + circleArea);
    }
}

