//Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade média da viagem, informe o tempo que uma família levará saindo de sua cidade de férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo calculado.

import java.util.Scanner;
public class ex007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Entrada
        double distancia;
        double velocidade;
        double media_Tempo;

        System.out.println("Informe a distancia em KM da sua cidade até o destino: ");
        distancia = in.nextInt();
        System.out.println("Informe a velocidade média da viagem ");
        velocidade = in.nextInt();

        //Processamento

        media_Tempo = distancia / velocidade;

        //Saida

        System.out.println("O tempo médio de viagem é de : " + media_Tempo + " horas");

        in.close();
    }
}
