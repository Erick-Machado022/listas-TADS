//Desenvolva o algoritmo de um programa onde o usuário irá informar um número inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao número digitado pelo usuário.

import java.util.Scanner;

public class ex001{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        //Entrada
        int num;
        int posterior;
        System.out.println("Informe um valor"); 
        num = in.nextInt();

        //Processamento

        posterior = num + 1;

        //Saida

        System.out.println("O valor informado foi: " + num + " e seu sucessor e " + posterior );

    }
}
