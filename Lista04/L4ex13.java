/*
 Faça um programa que receba 3 notas de um aluno, e escolha apenas as duas
maiores notas para o cálculo da média. Apresente a média final, entre as duas
maiores notas. Dica: utilize 3 comandos if.
 */

import java.util.Scanner;

public class L4ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        float nota = 0;
        int cont = 1;
        float maior = 0, maior2 = 0;
        float media;

        while (cont <= 3) {
            System.out.printf("Informe a %dº nota: ",cont);
            nota = in.nextFloat();

            if(nota>maior){
                maior2 = maior;
                maior = nota;
            }else if(nota>maior2){
                maior2 = nota;
            }
            cont++;
        }

        media = (maior + maior2) /2;
        System.out.println("A media das maiores notas são: " + media);

    }
}
