import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex2L8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random Random = new Random();

        System.out.print("Informe a quantidade de jogadas: ");
        int num = in.nextInt();
        

        int [] vetor = new int[num];
        int [] ladosDado = new int[6];


        for (int i = 0; i  < vetor.length; i++) {
            vetor[i] = Random.nextInt(6)+1;
            System.out.println("Rodada nº " + i + ": " + vetor[i]);

            ladosDado[vetor[i]-1]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Lado " + (i+1) + ": " + ladosDado[i] + " vezes");
        }


        

        
    }
}
