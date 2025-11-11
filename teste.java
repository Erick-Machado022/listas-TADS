import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num_inicial;
        int novo_valor;
        int maior;
        int menor;
        
        System.out.print("Informe um valor inicial: ");
        num_inicial = in.nextInt();

        while (true) {
            System.out.print("Informe outro valor: ");
            novo_valor = in.nextInt();

            if(num_inicial > novo_valor){
                maior = num_inicial;
                menor = novo_valor;
            }else{
                maior = novo_valor;
                menor = num_inicial;
            }

            
            if(novo_valor == 0){
                System.out.println("Programa encerrado");
                break;
            }else{

                if(maior % menor == 0){
                    if(maior == novo_valor){
                    System.out.println(novo_valor + " é multiplo de " + num_inicial);
                    }
                    else{
                        System.out.println(novo_valor + " é divisor de  " + num_inicial);
                    }
                }
                else{
                    System.out.println(novo_valor + " não é nada de " + num_inicial);
                }
                    
            }
            num_inicial = novo_valor;
                
        }
        

        in.close();

    }
}
