// Ler um número inteiro n. Escrever a soma de todos os números pares de 2 até n

package Lista04;

import java.util.Scanner;

public class somaPar {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int n;
        int cont = 2;
        int soma = 0;

        System.out.println("Informe um número: ");
        n = in.nextInt();

        while (cont <= n) {
            if (cont % 2 == 0){
                soma = soma + cont;
                System.out.println("Achei um número par: " + cont);
            }
            cont++;
        }
        System.out.println(soma);
    }
}
