package first_colloquium_ppj_training.Task5;

import java.util.Scanner;

public class Task504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("wpisz miesiąc: ");
        int month = sc.nextInt();
        System.out.print("wpisz rok: ");
        int year = sc.nextInt();

        switch (month){
            case 1:
                System.out.println("styczeń w roku: "+year+" ma 31 dni");
                break;
            case 2:
                if (isLeapYear(year)){
                    System.out.println("luty w roku: "+year+" ma 29 dni ponieważ jest to rok przestępny");
                }else {
                    System.out.println("luty w roku: "+year+" ma 28 dni");
                }
                break;
            case 3:
                System.out.println("marzec w roku: "+year+" ma 30 dni");
                break;
            case 4:
                System.out.println("kwiecień w roku: "+year+" ma 31 dni");
                break;
            case 5:
                System.out.println("maj w roku: "+year+" ma 30 dni");
                break;
            case 6:
                System.out.println("czerwiec w roku: "+year+" ma 31 dni");
                break;
            case 7:
                System.out.println("lipiec w roku: "+year+" ma 30 dni");
                break;
            case 8:
                System.out.println("sierpień w roku: "+year+" ma 31 dni");
                break;
            case 9:
                System.out.println("wrzesień w roku: "+year+" ma 30 dni");
                break;
            case 10:
                System.out.println("październik w roku: "+year+" ma 31 dni");
                break;
            case 11:
                System.out.println("listopad w roku: "+year+" ma 30 dni");
                break;
            case 12:
                System.out.println("grudzień w roku: "+year+" ma 31 dni");
                break;
            default:
                System.out.println("niepoprawny miesiąc");
        }

    }
    public static boolean isLeapYear(int year){
        if ((year%4==0&&year%100!=0)||(year%400==0)){
            return true;
        }else {
            return false;
        }
    }
}
