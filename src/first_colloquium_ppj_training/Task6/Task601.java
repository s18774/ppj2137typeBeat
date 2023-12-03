package first_colloquium_ppj_training.Task6;

public class Task601 {
    public static void main(String[] args) {
        //różnice pomiędzy while a do-while

        int a = 25;
        int b = 13;

        int c = 25;
        int d = 13;

        int e = 25;
        int f = 13;

        System.out.println("normalny WHILE który nie zadziałą");
        while (a<b){//jednak tutaj nie zadziała ani razu jeżeli warunek początkowy nie jest spełniony
            System.out.println("a: "+a+" b: "+b);
            b++;
        }
        System.out.println("WHILE ale działający");
        while (c>d){// tutaj będzie działać normalnie
            System.out.println("c: "+c+" d: "+d);
            d++;
        }

        System.out.println("DO WHILE działający raz ponieważ nie spełniony jest warunek e<f");
        do {
            System.out.println("e: "+e+" f: "+f);
            f++;
        }while (e<f);
    }
}
