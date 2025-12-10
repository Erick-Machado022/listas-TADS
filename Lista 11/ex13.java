/*Gere matriz 4 x 4 com valores no intervalo [1, 20]. Escreva um programa que transforme
a matriz gerada numa matriz triangular inferior, ou seja, atribuindo zero a todos os elementos
acima da diagonal principal. Imprima a matriz original e a matriz transformada */

import java.util.Random;

public class ex13 {
    public static void main(String[] args) {
        Random random = new Random();

       int[][] matriz = new int[4][4];

        
       //preencher uma matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("===============");

        //fazer a diagonal principal e verificar

        /*
        i0  j0 j1 j2 j3 
        i1  j0 j1 j2 j3
        i2  j0 j1 j2 j3
        i3  j0 j1 j2 j3
        */

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i<j){
                    matriz[i][j] = 0;
                }
            }
        }

        // mostra a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
