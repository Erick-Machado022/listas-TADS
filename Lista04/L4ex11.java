/*
 Escreva um algoritmo para ler 2 valores e, se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor lido não pode ser aceito o valor zero. Após ler os 2 valores, imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 
 */

import java.util.Scanner;

public class L4ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        float v1,v2;
        int cont = 1;
        
            System.out.printf("Informe o %dº valor: ",cont);
            v1 = in.nextFloat();
            cont++;
            System.out.printf("Informe o %dº valor: ",cont);
            v2 = in.nextFloat();
            
            while (v2 ==0) {
                System.out.println("Segundo valor não pode ser zero,");
                System.out.printf("Informe o %dº valor", cont);
                v2 = in.nextFloat();
            }

        float div = v1 / v2;
        System.out.printf("%.0f / %.0f  = %.1f",v1,v2,div);
            
               
            
            
        
    }
}
