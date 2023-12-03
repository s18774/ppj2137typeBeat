package first_colloquium_ppj_training.Task4;

public class Task406 {
    public static void main(String[] args) {
        //•	 'a' + 2
        //•	 'a' + '2'
        //•	(char)('a' + 2)
        //•	"ppj" + 'a' + '2'
        //•	"ppj" + 'a' + '\t' + '2'
        //•	'a' + '2' + "ppj"

        //chary dodawane zmieniaja sie w cyfry według tabelii ASCII
        //w przypadku takiego wyrażenia (char)('a' + 2) uzyskamy wartość 99 która następnie zostanie skonwertowana zgodnie z tabelą ascii na znak 'c'

        System.out.println('a'+2);
        System.out.println('a' + '2');
        System.out.println((char)('a' + 2));
        System.out.println("ppj" + 'a' + '2');
        System.out.println("ppj" + 'a' + '\t' + '2');
        System.out.println('a' + '2' + "ppj");
    }
}
