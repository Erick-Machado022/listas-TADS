public class ex12 {
    public static void main(String[] args) {

        int tam = 4;
        int [] [] matriz = {
            {2,1,3,4},
            {1,2,3,4},
            {1,2,2,4},
            {1,2,3,2},
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("======");

        int [] [] transposta = new int[tam][tam];

        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta.length; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }

        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta.length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
