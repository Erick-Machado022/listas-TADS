package Desenhos;

public class trianguloReto {
    public static void main(String[] args) {
        final int LINHAS = 4;

        for(int l = 0; l<LINHAS; l++){
            for(int c = 0; c<=l; c++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
