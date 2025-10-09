package Lista04;

import java.util.Scanner;

/*
 Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo que permita a entrada das seguintes informações: 
 a) o número total de mercadorias no estoque 
 b) o valor de cada mercadoria. 
 Ao final imprimir o valor total em estoque e a média dos valores das mercadorias
 */
public class loja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        int num_mercadoria = 0;
        int total_mercadoria = 0;
        float valor_mercadoria = 0;
        float soma_mercadoria = 0;


        while (true) {
            
        
        System.out.print("Quantas mercadorias há no estoque? ");
        num_mercadoria = in.nextInt();
        if (num_mercadoria == 0){
            break;
        }
        total_mercadoria = total_mercadoria + num_mercadoria;
        System.out.println("Valor do produto: ");
        valor_mercadoria = in.nextFloat();
        soma_mercadoria = soma_mercadoria + (valor_mercadoria * num_mercadoria);
        }

        float media_mercadoria = soma_mercadoria / total_mercadoria;
        System.out.println("O valor total em estoque é R$" + soma_mercadoria);
        System.out.println("A media dos valores de mercadoria é: R$" + media_mercadoria);
        in.close();
    }
}
