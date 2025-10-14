package Desenhos;

public class QuadracoOco {
    public static void main(String[] args) {
        final int LINHAS = 5;
        final int COLUNAS = 5;

        for(int l = 0; l<LINHAS;l++){
            for(int c = 0; c<COLUNAS; c++){
                if(l==0 || l==4 || c==0 || c==4){
                System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
