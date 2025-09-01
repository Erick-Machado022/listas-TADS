//Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para graus Celsius.

import java.util.Scanner;
public class ex005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //Entrada
        float fahrenheit;
        float celsius;
        System.out.println("Digite os graus Fahrenheit");
        fahrenheit = in.nextFloat();

        //Processamento

        celsius = ((fahrenheit-32)*5)/9;

        //Saida

        System.out.println("A temperatura em graus celsius é : " + celsius);

    }
}
