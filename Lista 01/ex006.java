//Desenvolva o algoritmo de um programa para calcular a média de duas notas das avaliações de um aluno.

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Entrada
        float n1;
        float n2;
        float media;

        //Processamento
        System.out.println("Vamos verificar a media de suas notas.");
        System.out.println("Digite a sua primeira nota: ");
        n1 = in.nextFloat();
        System.out.println("Digite a sua segunda nota: ");
        n2 = in.nextFloat();

        media = (n1 + n2) / 2;
        //saida
        System.out.println("A media das notas foi: " + media);

        in.close();
    }
}