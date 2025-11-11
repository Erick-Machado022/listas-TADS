import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Variaveis
        int idade;
        String classificação;


        System.out.println("Informe sua idade: ");
        idade = in.nextInt();

        if(idade > 0 && idade <= 12){
             classificação = "Criança";
        }

        else if(idade >= 13 && idade <= 17){
             classificação = "Adolescente";
        }

        else if(idade >= 18 && idade <= 59){
             classificação = "Adulto";
        }

        else{
             classificação = "Idoso";
        }

        System.out.printf("Você é %s", classificação);
        in.close();
    }
    
}
