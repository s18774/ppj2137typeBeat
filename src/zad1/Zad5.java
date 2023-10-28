package zad1;

public class Zad5 {
        public static void main(String[] args) {
            double result = divide(
                    divide(add(add(1, multiply(2, 3)), 4), subtract(5, 6)) + 78,
                    subtract(9, divide(10, 11))
            );

            System.out.println("Wynik: " + result);
        }

        // Metoda do dodawania
        public static double add(double a, double b) {
            return a + b;
        }

        // Metoda do odejmowania
        public static double subtract(double a, double b) {
            return a - b;
        }

        // Metoda do mnożenia
        public static double multiply(double a, double b) {
            return a * b;
        }

        // Metoda do dzielenia
        public static double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Błąd: Nie można dzielić przez zero.");
                System.exit(1);
            }
            return a / b;
        }
    }


