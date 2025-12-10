public class ex7 {
    public static void main(String[] args) {
        
        int [][] matriz = new int[10][10];

        //percorre a matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //verifica o i e j e faz a operação matematica
                if(i<j){
                    matriz[i][j] = (2*i) + (7*j) - 2;
                }
                else if (i==j) {
                    matriz[i][j] = (3*i)*i -1;
                }
                else {
                    matriz[i][j] = 4*(i*i*i) - 5*(j*j) + 1;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
