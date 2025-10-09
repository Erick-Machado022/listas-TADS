package Lista04;

import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);  

        String senha = "12345";
        String tentativa = "";
        int cont = 1;

        while (true) {
            System.out.print("Informe sua senha: "); tentativa = in.next();
            if (tentativa.equals(senha)){
                break;
            }
            else{
            System.out.println("Senha incorreta, tente novamente.");
            cont++;
            }
            
        }

        System.out.println("Senha correta");
        System.out.println("Total de tentativas: " + cont);




        in.close();
    }
}
