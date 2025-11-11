import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;

        System.out.println("Informe um número: ");
        num = in.nextInt();

        if(num %2 == 0){
            System.out.println("Seu número é par");
            
        }
        else{
            System.out.println("Seu número é impar");
        } 

        if(num %5 ==0){
                System.out.println("E é divisivel por 5");
        }
        else{
                System.out.println("E não é divisivel por 5");
        }

        in.close();
    }

}
