public class ex4 {
    public static void main(String[] args) {
        int [][] matriz = {
            {1,2,3,4},
            {2,3,15,5},
            {3,4,5,6},
            {6,7,8,9}
        };

        int maior =0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
            System.out.println();
        }

        System.out.println("O maior numero é " + maior + " Nas posições " + linha + " " + coluna);
    }
}
