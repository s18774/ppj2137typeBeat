package zad3;

public class Zad607 {
    public static void main(String[] args) {

        double a = 2.0;
        double b = 3.0;
        double c = 12.0;
        double d = 1.0;
        double e = 2.0;
        double f = 7.0;

        double wyznacznik = a * e - b * d;

        // Sprawdzamy czy układ ma jedno rozwiązanie
        if (wyznacznik != 0) {
            // Obliczamy rozwiązania x i y
            double x = (c * e - b * f) / wyznacznik;
            double y = (a * f - c * d) / wyznacznik;

            System.out.println("Rozwiązania układu równań:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else if (c == 0 && f == 0) {
            System.out.println("Nieskończenie wiele rozwiązań układu.");
        } else {
            System.out.println("Układ równań nie ma rozwiązań.");
        }
    }
}
