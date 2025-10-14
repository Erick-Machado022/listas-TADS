package Desenhos;

public class RetanguloCheio {
    public static void main(String[] args) {

        final int LINHAS = 3;
        final int COLUNAS = 7;

        for(int l = 0; l<LINHAS;l++){
            for(int c=0; c<COLUNAS; c++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
