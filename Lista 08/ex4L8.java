import java.util.Arrays;
import java.util.Scanner;

public class ex4L8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
        }
        System.out.println("===PARES===");
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] %2 == 0){
                
                System.out.println(vetor[i] + " Par");
            }
        }
        System.out.println("===ÍMPARES===");
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] %2 == 1){
                
                System.out.println(vetor[i] + " Impar");
            }
        }
    }
}
