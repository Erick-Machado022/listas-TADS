/*
Faça um programa que peça para o usuário digitar um valor qualquer (inteiro).
Enquanto o valor digitado não for múltiplo 5, o programa continua solicitando ao
usuário para digitar um valor. O programa somente irá encerrar quando o valor
digitado for múltiplo de 5.
*/

import java.util.Scanner;

public class L4ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe um valor multiplo de 5: ");
        int num = in.nextInt();
        while (true) {
            if (num % 5 != 0){
                System.out.println(num + " não é multiplo de 5");
                System.out.print("Informe um novo valor: ");
                num = in.nextInt();
            }else{
                break;
            }
        }
        System.out.println(num + " é multiplo de 5");
    }
}
