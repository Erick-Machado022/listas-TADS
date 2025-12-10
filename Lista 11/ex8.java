import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        int [] [] matriz = {
            {0,1,1,1},
            {2,0,1,1},
            {2,1,0,1},
            {2,1,1,0}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            
        }

        System.out.println("==========================");

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j){
                    soma = soma + matriz[i][j];
                }
                
            }
        }

        System.out.println(soma);

    }   
}
