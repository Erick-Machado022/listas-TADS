public class ex11 {
    public static void main(String[] args) {
        int [] [] matriz = {
            {2,1,3,4},
            {1,2,3,4},
            {1,2,2,4},
            {1,2,3,2},
        };

        int soma = 0;

        int tam = matriz.length;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            
        }

        for (int i = 0; i < tam; i++) {
            int j = tam - 1 - i;
            soma = soma + matriz[i][j];
            
        }

        System.out.println(soma);

       
    }
}
