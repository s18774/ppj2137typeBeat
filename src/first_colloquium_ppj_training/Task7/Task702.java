package first_colloquium_ppj_training.Task7;

public class Task702 {
    public static void main(String[] args) {
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <9 ; j++) {
                if ((i+j)%2 == 0){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
