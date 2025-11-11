//Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e (c) depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o valor do saldo deve ser atualizado.




import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        float saldo = 0;
        char opc;
        

        while (true) {
            System.out.println("""
                ===================
                (a) Consultar Saldo
                (b) Saque
                (c) Depósito
                (d) Sair
                ===================
                """);
            System.out.println("Escolha a opção: ");
            opc = in.next().charAt(0);
            if (opc == 'a'){
                System.out.println("=====SALDO=============");
                System.out.println("R$"+saldo);
                System.out.println("=======================");
            }

            else if(opc == 'b'){
                float saque;
                System.out.println("Valor a sacar: ");
                saque = in.nextFloat();
                if(saque > saldo){
                    System.out.println("Não há saldo disponivel para esta transação");
                }
                else{
                    saldo = saldo - saque;
                    System.out.println("Sacando: "+ saque);
                }
            }

            else if(opc == 'c'){
                float deposito;
                System.out.println("Valor a depositar: ");
                deposito = in.nextFloat();
                saldo += deposito;
                System.out.println("Acrescentando " + deposito + " em seu saldo.");
            }

            else if (opc == 'd') {
                System.out.println("Finalizando programa");
                System.out.println("<<<VOLTE SEMPRE>>>");
                break;
            }
        }
        System.out.println("Programa finalizado.");
        in.close();
    }
}
