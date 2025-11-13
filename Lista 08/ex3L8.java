import java.util.Scanner;

public class ex3L8 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float [] vetor = new float[10];
        float soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            
            System.out.print("Informe o " + (i+1) + "º valor: ");
            
            vetor[i] = in.nextFloat();
            soma = soma + vetor[i];
        }

        float media = soma / vetor.length;

        System.out.println("A media dos valores digitados são: " + media);
    }
}
