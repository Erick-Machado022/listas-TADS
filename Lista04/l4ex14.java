/*
 Ler 10 valores e escrever quantos desses valores lidos estão compreendidos entre o
intervalo de 1 até 10. Mostre a multiplicação entre valores digitados no intervalo de 0
e 10, e a soma dos valores fora deste intervalo.
 */

import java.util.Scanner;

public class l4ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int cont = 1;
        int valor;
        int multi = 0;
        int soma = 0;
        int contIntervalo = 0;

        while (cont <=10) {
            System.out.printf("Informe o %dº valor: ", cont);
            valor = in.nextInt();
            if(valor >= 0 && valor <=10){
                contIntervalo++;
                if (valor > 0)
                    multi = multi * valor;
                
            }else{
                soma = soma + valor;
            }

            cont++;
        }

        System.out.printf("Quantidade de valores entre 0 e 10: %d%n", contIntervalo);
        System.out.printf("Multiplicação dos valores no intervalo (0 a 10): %d%n", multi);
        System.out.printf("Soma dos valores fora do intervalo: %d%n", soma);
    in.close();
    }
}
