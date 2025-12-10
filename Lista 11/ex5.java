import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [][] matriz = {
            {0,2,6,7,8},
            {1,8,9,10,12},
            {2,5,8,6,7},
            {12,13,15,70,80},
            {10,5,80,99,100},
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Deseja encontrar qual valor? ");
        int valor = in.nextInt();


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == valor){
                    System.out.println("Localização na linha " + i + " e coluna " + j);
                }
                
            }
        }
    }
}
