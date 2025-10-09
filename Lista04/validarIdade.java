package Lista04;

/*
 *Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente
idade válida, ou seja, o algoritmo deve “validar” a leitura da idade. Idade válida tem
que ser maior que 0 e menor que 150. Escrever a idade lida.
 */
import java.util.Scanner;

public class validarIdade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade;

        while (true) {
            System.out.print("informe sua idade: ");
            idade = in.nextInt();
           if (idade < 1 || idade >= 150){
            System.out.println("Idade invalida! TENTE NOVAMENTE");
           }
           else{
            break;
           }
        }
        System.out.println("Idade Validada");
        in.close();
    }
}
