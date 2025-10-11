/*
 Escreva um algoritmo para ler um salário. O algoritmo deve “validar” a leitura do salário para aceitar somente um “salário válido”. Você deve definir o que é um “salário válido”. Escrever o salário lido.
 */

import java.util.Scanner;

public class L4ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        float validador = 0;
        
         System.out.print("Informe seu salário: ");
        float salario = in.nextFloat();
        if (salario < validador){
            while (salario < validador) {
            System.out.println("Salário inválido");
             System.out.print("Informe seu salário: ");
             salario = in.nextFloat();
            }
            
        }else{
            System.out.println("Salário válido: R$" + salario);
        }  

        
        
    }
}

