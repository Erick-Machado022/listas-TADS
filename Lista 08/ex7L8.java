import java.util.Arrays;
import java.util.Scanner;

public class ex7L8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = new int[5];

    
        while (true) {
            System.out.println("Sistema de votação ");
            int digitado = in.nextInt();
            if(digitado == -1){
                break;
            }

            vetor[digitado-1]++;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Candidato " + (i+1) + " contou: " + vetor[i] + " votos");
        }
            
            


    


    }
}
