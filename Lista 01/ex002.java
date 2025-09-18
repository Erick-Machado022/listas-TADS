//O algoritmo deve ter como entrada um número real e a saída deve ser o valor atualizado com os 20%.

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        //Entrada
        float num;
        float atualizado;

        System.out.println("Digite um número");
        num = in.nextFloat();

        //Processamento
        atualizado = num + (num * (20.f/100.f));

        //Saida
        System.out.println(atualizado);


        in.close();
    }
}
