package zad3;

public class Zad601 {
    public static void main(String args[]){
        //while vs do--while

        int i = 1;

        System.out.println("pętla while");
        while (i<=0){
            System.out.println("to się nie wykona ponieważ i nie jest <= 0");
        }

        System.out.println("pętla do while");
        do {
            System.out.println("to się wykona minimum raz");
        }while (i<=0);
    }
}
