/*Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que est ˜ao na diagonal
principal. */


public class ex10 {
    public static void main(String[] args) {
        int [][] matriz = {
            {1,2,3},
            {3,2,1},
            {2,4,6}
        };

        //LER UMA MATRIZ
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //calculando a diagonal principal.
        int soma =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j){
                    soma = soma + matriz[i][j];
                }
            }
        }

        System.out.println("A soma da diagonal principal é: " + soma);
    }
}
