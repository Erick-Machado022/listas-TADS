/*
Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor
lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após
a leitura do valor, escrever o valor lido na tela.
 */



import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println("Informe um número inteiro: ");
            num = in.nextInt();
            if(num >=1 && num <= 10){
                break;
            }
            else{
                System.out.println("Informe novamente. ");
            }
        }
        System.out.println(num);
        in.close();
    }
}
