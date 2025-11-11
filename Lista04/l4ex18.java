/*
 Faça um programa que, para um número indeterminado de pessoas: leia a idade de
cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser
considerada. A seguir calcule:
• o número de pessoas;
• a idade média do grupo;
• a menor idade e a maior idade.

 */

import java.util.Scanner;

public class l4ex18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cont = 0;
        int idade = 0;
        int maior = 0;
        int menor = 0;
        int soma = 0;
        while (true) {
            System.out.println("informe sua idade: ");
            idade = in.nextInt();
            if(idade == 0){
                break;
            }
            
            cont++;
            soma += idade;

            if(cont==1){
                maior = idade;
                menor = idade;
            }else{
                if(idade > maior){
                    maior = idade;
                }
                if(idade < menor){
                    menor = idade;
                }
            }
        }

        float media = soma / cont;

        if(cont==0){
            System.out.println("Não há pessoas cadastradas.");
        }
        else{
            System.out.println("O número de pessoas cadastradas foram: " + cont);
            System.out.println("A idade média do grupo é: "+media);
            System.out.println("Menor idade: "+menor);
            System.out.println("Maior idade: "+maior);
        }





        in.close();
    }
}
