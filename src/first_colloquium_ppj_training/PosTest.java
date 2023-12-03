package first_colloquium_ppj_training;

public class PosTest {
    public static void main(String[] args) {
        int n = 20;
        int sum=0;

        for (int i = 0; i < n; i++) {

            int temp = 1;
            while (temp!=0){
                sum+=temp%10;
                temp/=10;
            }
        }
        //System.out.println(temp);
    }

}
