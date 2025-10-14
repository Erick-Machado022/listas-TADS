/*Receba um número inteiro positivo, e o seu respectivo expoente inteiro positivo, e
apresente o resultado da potência deste número. Faça isso utilizando o comando
while. Tenha cuidado com as inicializações! */

import java.util.Scanner;

public class l4ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int expo;
        int resultado = 1;
        int cont = 1;

        System.out.print("Informe um número inteiro: ");
        num = in.nextInt();
        System.out.print("Informe seu expoente: ");
        expo = in.nextInt();

        while(cont <= expo){
            resultado *= num;
            cont++;
        }
        System.out.println(num + " elevado a " + expo + " = " + resultado);
    }
}
