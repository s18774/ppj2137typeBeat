package zad2;

public class zad501 {
    public static void main(String [] args){
        //najbardziej basicowa wersja zadania
        int wrt = 6;
        if ((-15<wrt & wrt<=-10) || (-5<wrt & wrt<0) || (5<wrt & wrt<10) || (Double.NEGATIVE_INFINITY< wrt & wrt<=-13) || (-8<wrt & wrt<=-3) ||(-4<=wrt & wrt<Double.NEGATIVE_INFINITY) ){
            System.out.println(wrt+" należy do któregoś zbioru");
        }else {
            System.out.println("nie nalezy do żadnego zbioru");
        }



    }
    //teraz będziemy sprawdzać czy należy do części wspólnej
    public static boolean isInIntersection(int wrt) {
        boolean inA = (
                (-15 <= wrt && wrt <= -10) || (-5 < wrt && wrt < 0) || (5 < wrt && wrt <= 10)
        );
        boolean inB = (
                (Double.NEGATIVE_INFINITY <= wrt && wrt <= -13) || (-8 < wrt && wrt <= -3)
        );
        boolean inC = (-4 <= wrt);

        return inA && inB && inC;
    }
}
