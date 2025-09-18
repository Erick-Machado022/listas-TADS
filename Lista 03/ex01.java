import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe um numero inteiro: ");
        int num = in.nextInt();

        if(num < 0){
            System.out.printf("O numero %d e negativo", num);
        }
        else if(num == 0){
            System.out.printf("Este numero e  zero");
        }
        else if(num > 0){
            System.out.printf("O numero digitado é positivo");
        }
    }
}
