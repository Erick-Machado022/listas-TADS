import java.util.Arrays;
import java.util.Scanner;

public class ex8L8 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int [] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int iguais = 0;
        int maior = 0;
        int menor = 0;

       /*  for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();

        }
        */
        System.out.println(Arrays.toString(vetor));

        System.out.println("Escolha uma posição para parametro: ");
        int num = in.nextInt();

        System.out.println(vetor[num]);

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[num] == vetor[i]){
                
                iguais++;
            }
            else if(vetor[i] < vetor[num]){
                
                menor++;
            }
            else if(vetor[i] > vetor[num]){
                maior++;
            }
        }

        System.out.println(maior + " números são maiores que " + vetor[num] );
        System.out.println(menor + " números são menores que " + vetor[num] );
        System.out.println(iguais + " números são iguais que " + vetor[num] );
    }

}

