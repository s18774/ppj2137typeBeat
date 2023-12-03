package first_colloquium_ppj_training.Task7;

public class Task704 {
    public static void main(String[] args) {
        int n = 4;
        int size = n*2;
        for (int i = 0; i <=size ; i++) {
            for (int j = 0; j <=size ; j++) {
                if (((i+j)/2 >=n) && ((i+j)/2<=size)){
                    System.out.print("*");
                }else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
