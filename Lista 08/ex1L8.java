/*Dada uma seqüência de n números, imprimi-la na ordem inversa à da leitura */

import java.util.Arrays;
import java.util.Scanner;

public class ex1L8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Quantos valores serão armazenados?");
        int tam = in.nextInt();

        int [] vetor = new int[tam];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um valor: ");
            vetor[i] = in.nextInt();
            
        }

        System.out.println(Arrays.toString(vetor));
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.print((vetor[i] + " "));            
        }
    }
}
