package zad1;

public class Zad7 {
    public static void main(String [] args) {
        double x = 1,
                d = 1e-16,// tutaj występuje problem dokładności
                y = x + d;
        System.out.println(d > 0);//d jest minimalnie większe niż 0
        System.out.println(x < y);//jednak tutaj przez problem dokładności y jest takie same jak x i dlatego wynik jest false
        System.out.println(x == y);//jw
        System.out.println(x > y);//jw
    }
}
