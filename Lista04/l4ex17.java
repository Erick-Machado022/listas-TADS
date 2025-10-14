/*
 Desenvolva um programa em Java que determine o pagamento bruto de cada um de
vários empregados. A companhia paga o valor de uma "hora normal" pelas primeiras
40 horas trabalhadas de cada empregado e paga o valor de uma "hora extra" (uma
vez e meia a hora normal) para cada hora trabalhada depois de completadas as
primeiras 40 horas. Seu programa deve primeiramente receber a informação de
quantos empregados trabalharam durante a semana. Em seguida, receba cada uma
das informações acima descritas, para cada empregado, e mostre o pagamento
bruto para cada um deles. O valor da hora de cada empregado deve ser também
solicitado, pois pode ser diferente para cada empregado.

 */

import java.util.Scanner;

public class l4ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empregados = 0;
        float hrs_trabalhadas = 0;
        float valor_hora = 0;
        float hrs_extras;
        int cont=1;
        float pgto = 0;

        System.out.print("Quantos empregados trabalharam: ");
        empregados = in.nextInt();

        while (cont <= empregados) {
            System.out.println("Funcionario "+cont + ":");
            System.out.println("Quantas horas foram trabalhadas");
            hrs_trabalhadas = in.nextFloat();
            System.out.print("Qual o valor da Hora: R$");
            valor_hora = in.nextFloat();
            if(hrs_trabalhadas < 40){
                pgto = hrs_trabalhadas * valor_hora;
                System.out.println("Pgto bruto: R$" + pgto);
            }else{
                hrs_extras = hrs_trabalhadas - 40;
                
                pgto = valor_hora * 40 + (hrs_extras * (valor_hora * 1.5f));

                System.out.println("Pgto bruto: R$ "+pgto);
            }
            System.out.println("__________");




            cont++;
        }

    }
}
