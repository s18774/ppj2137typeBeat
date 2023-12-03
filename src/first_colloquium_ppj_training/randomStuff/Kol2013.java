package first_colloquium_ppj_training.randomStuff;

public class Kol2013 {
    public static void main(String[] args) {
         A tab[];

        System.out.println("konstruktor Klasy A");
         A a = new A(10);
        System.out.println("konstruktor Klasy B");
        B b = new B(20, 3.14f);
        System.out.println("konstruktor Klasy C");
        C c = new C(30, 6.28f, 'b');
        System.out.println();

         tab = new A[]{a,b,c};
        System.out.println("pierwszy show ----------------------");
         show(tab);

         a.inc();
         b.mul(3.0f);
        System.out.println("drugi show ----------------------");
        show(tab);

         c.wrtC = 'd';

        System.out.println("trzeci show ----------------------");
        show(tab);
    }

    public static void show(A tab[]){
        for (int i = 0; i < tab.length ; i++) {
            System.out.println(tab[i].toString());
        }
    }
}


class A{
    int wrtI ;

    public A ( int wrtI ) {
         this . wrtI = wrtI ;
         System . out . println ( "A"+wrtI ) ;
    }

    public void inc ( ) {
         wrtI++;
    }

    public String toString ( ) {
         return ""+wrtI ;
    }
}

class B extends A{
    float wrtF ;

         public B ( int wrtI , float wrtF ) {
         super ( wrtI ) ;
         this . wrtF = wrtF ;
         System . out . println ( "B"+wrtF ) ;
         }

         public void mul ( int mno ) {
         wrtF *= mno + 1 ;
         }

         public void mul ( float mno ) {
         wrtF *= mno;
         }

         public String toString ( ) {
         return ""+wrtF ;
         }
}

class C extends B{
    char wrtC = 'a' ;

         public C ( int wrtI , float wrtF , char wrtC ) {
         super ( wrtI , wrtF ) ;
         wrtC = wrtC ;
         System . out . println ( "A"+wrtC ) ;
         }

         public String toString ( ) {
         return ""+wrtC ;
         }
}