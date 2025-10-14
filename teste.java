import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int LINHAS = 6;
        final int COLUNAS = 6;

        for(int l = 0; l < LINHAS; l++){
            for(int c = 0; c< COLUNAS; c++){
                if(l == 0 || l == 5 || c==0 || c==5){
                    System.out.print("x");
                }
                else{
                    System.out.print(" ");
                }
            }
             
            

            System.out.println();
        }
    }
}
