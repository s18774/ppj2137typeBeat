package first_colloquium_ppj_training.Task4;

public class Task403 {
    public static void main(String[] args) {
        int a =2;
        int b= 2;

        double doubleA = 2.0;
        double doubleB = 3.2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println(doubleA+doubleB);
        System.out.println(doubleA-doubleB);
        System.out.println(doubleA*doubleB);
        System.out.println(doubleA/doubleB);
        System.out.println(doubleA%doubleB);

        System.out.println("poniżej działania mieszane int z double(jak można zauważyć wynik jest w postaci double)");
        System.out.println(a+doubleA);
        System.out.println(a/doubleA);
        System.out.println(doubleB*b);

        System.out.println("działania na znakach");
        System.out.println('a'+'a');//dodawanie na znakach zmienia je po prostu w liczby zgodnie z tabelą ASCII
        System.out.println('g'/'e');
    }



}
