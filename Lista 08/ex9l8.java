import java.util.Arrays;
import java.util.Scanner;

public class ex9l8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor_inicial = {1,2,3,4,5};
        int [] vetor_Final = new int[5];

        boolean existe = false;
        int num = 0;
    System.out.println("teste");
        while (! Arrays.equals(vetor_Final, vetor_inicial)) {
            for (int i = 0; i < vetor_inicial.length; i++) {
                num = in.nextInt();
                if (num == vetor_inicial[i]){
                    
                    System.out.println("achei um igual");


                    vetor_Final[i] = num;

                    System.out.println(Arrays.toString(vetor_Final));
                }

                
            }
            if (Arrays.equals(vetor_Final, vetor_inicial)) {
                    break;
                }
        }

        System.out.println("Fim!");

        
    }   
}
