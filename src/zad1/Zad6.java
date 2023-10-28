package zad1;

public class Zad6 {
    public static void main(String [] args){
        System.out.println('a'+2);//1
        //W tej linii, 'a' jest traktowane jako znak, a następnie dodawane jest 2. Wynik to 99, ponieważ znak 'a' ma wartość ASCII 97, a więc 97 + 2 = 99
        System.out.println('a'+'2');//2
        //jak w poprzednim przypadku, znak 'a' ma wartość ASCII 97, a znak '2' ma wartość ASCII 50. Dodanie ich daje 147
        System.out.println((char)('a'+2));//3
        //Najpierw wykonuje się dodawanie 'a' + 2, co daje 99, a następnie wynik jest rzutowany na typ char, co powoduje, że 99 staje się znakiem ASCII 'c'
        System.out.println("ppj" + 'a' + '2');//4
        //W tym przypadku łączymy ciąg znaków "ppj" z literą 'a' i cyfrą '2'. Operacja konkatenacji łączy je w jednym ciągu znaków
        System.out.println("ppj" + 'a' + '\t' + '2');//5
        //W tej linii dodawane są kolejno: ciąg znaków "ppj", litera 'a', znak tabulacji '\t', i litera '2'. Tabulacja jest reprezentowana jako kilka spacji w wyniku wyświetlania
        System.out.println('a' + '2' + "ppj");//6
        //najpierw dodawane są wartości znaków 'a' i '2', co daje 147, a następnie jest to łączone z ciągiem "ppj". Wynik jest traktowany jako wynik dodawania w kodzie znaków, a nie konkatenacji ciągów znaków.
    }

}
