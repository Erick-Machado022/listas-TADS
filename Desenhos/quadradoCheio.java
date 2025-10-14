package Desenhos;

public class quadradoCheio {
    public static void main(String[] args) {
        
        final int LINHAS = 5;
        final int COLUNAS = 5;

        for(int l =0; l<LINHAS; l++){
            for(int c=0; c<COLUNAS; c++){
                System.out.print("x");
            }
            System.out.println();
        }

    }
}
