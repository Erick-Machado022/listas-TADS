//Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do triângulo.

import java.util.Scanner;
public class ex004 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        // Entrada
        float area;
        float base;
        float altura;

        System.out.println("Informe a base do Triangulo: ");
        base = in.nextFloat();
        System.out.println("Digite a algura do triangulo: ");
        altura = in.nextFloat();

        //Processamento

        area = (base * altura) / 2;
        



        //Saida

        System.out.println("Seguindo a base e altura informados a bese resulta em: " + area);

        in.close();
    }
    
}
