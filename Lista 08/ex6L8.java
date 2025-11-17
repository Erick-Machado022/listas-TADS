import java.util.Arrays;
import java.util.Scanner;

public class ex6L8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String palavra = in.next();

        String [] vetor = palavra.split("\\B");

        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
        }
    }
}