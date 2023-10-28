package zad1;

public class Zad3 {
    public static void main(String[]args){

                // Operacje na literałach liczb całkowitych
                int a = 10;
                int b = 3;
                int suma = a + b;
                int roznica = a - b;
                int iloczyn = a * b;
                int iloraz = a / b;
                int reszta = a % b;

                System.out.println("Operacje na liczbach całkowitych:");
                System.out.println("a + b = " + suma);
                System.out.println("a - b = " + roznica);
                System.out.println("a * b = " + iloczyn);
                System.out.println("a / b = " + iloraz);
                System.out.println("a % b = " + reszta);

                // Operacje na literałach liczb rzeczywistych
                double x = 10.5;
                double y = 3.2;
                double sumaDouble = x + y;
                double roznicaDouble = x - y;
                double iloczynDouble = x * y;
                double ilorazDouble = x / y;

                System.out.println("\nOperacje na liczbach rzeczywistych:");
                System.out.println("x + y = " + sumaDouble);
                System.out.println("x - y = " + roznicaDouble);
                System.out.println("x * y = " + iloczynDouble);
                System.out.println("x / y = " + ilorazDouble);

                // Operacje na literałach znaków
                char charA = 'A';
                char charB = 'B';
                //char sumaChar = charA + charB; // Operacja niedozwolona
                // char roznicaChar = charA - charB; // Operacja niedozwolona
                // char iloczynChar = charA * charB; // Operacja niedozwolona
                // char ilorazChar = charA / charB; // Operacja niedozwolona
                // char resztaChar = charA % charB; // Operacja niedozwolona

                 System.out.println("\nOperacje na znakach:");
                 // System.out.println("charA + charB = " + sumaChar);
                // System.out.println("charA - charB = " + roznicaChar);
                // System.out.println("charA * charB = " + iloczynChar);
                // System.out.println("charA / charB = " + ilorazChar);
                // System.out.println("charA % charB = " + resztaChar);

        //zad 4
        int k = 5;
        System.out.println((k=4) * k);//nawias ma większy priorytet dlatego wynik to będzie 16 ponieważ k zostaje zmienione na 4 czyli mamy 4*4=16

    }
}
