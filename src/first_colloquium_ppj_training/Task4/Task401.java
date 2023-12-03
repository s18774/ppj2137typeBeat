package first_colloquium_ppj_training.Task4;

public class Task401 {
    public static void main(String[] args) {
        //first we store our number as a String
        String studentNumerHex = "18774";

        //we create empty string to contain our binary converted number
        String binaryConverted ="";
        for (int i = 0; i <studentNumerHex.length() ; i++) {
            if (i!=0 && i<studentNumerHex.length()){
                binaryConverted+="_";
            }
            char temp = studentNumerHex.charAt(i);
            switch(temp){
                case '0':
                    binaryConverted+="0000";
                    break;
                case '1':
                    binaryConverted+="0001";
                    break;
                case '2':
                    binaryConverted+="0010";
                    break;
                case '3':
                    binaryConverted+="0011";
                    break;
                case '4':
                    binaryConverted+="0100";
                    break;
                case '5':
                    binaryConverted+="0101";
                    break;
                case '6':
                    binaryConverted+="0110";
                    break;
                case '7':
                    binaryConverted+="0111";
                    break;
                case '8':
                    binaryConverted+="1000";
                    break;
                case '9':
                    binaryConverted+="1001";
                    break;
            }
        }
        System.out.println(binaryConverted);
    }
}
