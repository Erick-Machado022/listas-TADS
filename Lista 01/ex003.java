// Desenvolva o algoritmo de um programa onde o usuário irá informar um número inteiro e o programa deve calcular e exibir quadrado do número informado pelo usuário.

import java.util.Scanner;

public class ex003 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        // Entrada
        int num;
        int quadrado;
        System.out.println("Digite um valor inteiro: ");
        num = in.nextInt();


        //Processamento
        quadrado = num * num;

        //Saida

        System.out.println("O quadrado de " + num + " é: " + quadrado);


        in.close();
    }
}