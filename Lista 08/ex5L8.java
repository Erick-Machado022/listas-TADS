import java.util.Arrays;
import java.util.Scanner;

public class ex5L8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + (i+1) + "º valor: ");
            vetor[i] = in.nextInt();
        }
        

        System.out.println(Arrays.toString(vetor));

        

        for (int i = 0; i < 10; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[i+10];
            vetor[i+10] = aux;

            
        }

        System.out.println(Arrays.toString(vetor));


    }
}
