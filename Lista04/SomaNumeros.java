// Ler um número inteiro n. Escrever a soma de todos os números de 1 até n

package Lista04;
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int cont = 1;
        int soma = 0;

        System.out.println("Informe um número: ");
        n = in.nextInt();

        while (cont < n) {
            soma = soma + cont;
            System.out.println(soma); // use println para cada resultado sair em linha
            cont++;
        }
    }
}
