package zad2;

public class zad502 {
    public static void main(String [] args){
        int a=1;
        int b=2;
        System.out.println("wynik podstawowej wersji równiania "+(!(a < b) && !(a > b)));
        System.out.println("wynik skróconego równiania "+(a >= b));

        System.out.println("czy równiania są identyczne? "+((!(a < b) && !(a > b)) ==(a >= b)));
    }
}
