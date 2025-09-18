import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int maior;
        maior = 0;

        System.out.println("Informe 3 números");
        System.out.println("Informe 1º número:");
        n1 = in.nextInt();
        System.out.println("Informe 2º número:");
        n2 = in.nextInt();
        System.out.println("Informe 3º número:");
        n3 = in.nextInt();

        if(n1 > n2 && n1 > n3){
            maior = n1;
        }

        else if(n2 > n1 && n2>n3){
            maior = n2;
        }

        else{
            maior = n3;
        }

        System.out.printf("Os Números informados foram %s , %s , %s, e o maior deles é %s",n1,n2,n3,maior);

    }

}
