//Ler um número inteiro n. Decidir se n é um número primo e apresente o resultado.



import java.util.Scanner;

public class nPrimo {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);    

        int n;
        int divisor = 2;
        int encontrados = 0;


        System.out.println("Informe um número inteiro: ");
        n = in.nextInt();

        if (n <= 1){
            System.out.println(n + " não é primo");
        }

        else{
            while (divisor <= n/2) {
            if(n % divisor == 0){
                System.out.println("Encontrei um divisor: " + divisor);
                encontrados++;
            }
            divisor++;
            
        }

        if (encontrados == 0) {
            System.out.println(n + " é um número primo");
        }
        else{
            System.out.println(n + " Não é primo");
        }

        }

        

        in.close();
    }
}
