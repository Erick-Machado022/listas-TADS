/*
 Fazer um algoritmo que leia um número inteiro e escreva se ele é ou não um
número primo. Um número é primo quando ele é divisível somente por um e por ele
mesmo. Você utilizará uma combinação entre os comandos while e if.

 */


import java.util.Scanner;

public class l4ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            
        int divisor = 2;
        int n = 0;
        int encontados = 0;

        System.out.println("Informe um número inteiro: ");
        n = in.nextInt();

        if(n <= 1){
            System.out.println(n + " Não é primo");
        }
        else{
            while (divisor <= n/2) {
                if(n % divisor == 0){
                    System.out.println("Encontrei um divisor: " + divisor);
                    encontados++;
                }
                divisor++;

                if(encontados == 0){
                System.out.println(n + " é primo");
                }
                else{
                System.out.println(n + " Não é primo");
                }
            }
        }
       
        in.close();
    }
}
