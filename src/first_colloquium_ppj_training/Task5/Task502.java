package first_colloquium_ppj_training.Task5;

public class Task502 {
    public static void main(String[] args) {
        //zadanie na zredukowanie wyrażenia do najprostszej możliwej formy
        /*
            (!(a < b) && !(a > b))
            1.!(a<b) -> a>=b (nie wiem czemu ale musi być >=)
            2.!(a > b) -> a<=b
            3.(!(a < b) && !(a > b)) -> a==b
         */
        int a =2;
        int b =2;
        System.out.println(!(a < b));
        System.out.println(a >= b);
        System.out.println(!(a > b));
        System.out.println(a<=b);

        System.out.println("podsumowanie");
        System.out.println((!(a < b) && !(a > b)));
        System.out.println(a==b);
    }
}
