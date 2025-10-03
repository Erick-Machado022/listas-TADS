//Faça um programa que receba a 5 notas de um aluno, através do comando while, e que apresente ao final a média dessas 5 notas. Você deverá ter apenas uma variável nota, e uma variável média.

package Lista04;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float nota;
        float media = 0;
        int cont = 0;

        while (cont < 5) {
            cont++;
            System.out.println("Informe a " + cont + "ª nota");
            nota = in.nextFloat();
            media = media + nota;
            
            System.out.println(cont);
        }
        System.out.printf("A media final das notas foi %.2f%n ", media/cont );
    }
}
