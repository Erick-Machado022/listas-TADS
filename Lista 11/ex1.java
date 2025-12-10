public class ex1 {
    public static void main(String[] args) {
        

        int [] [] matriz1 = {
            {01,02,30,04},
            {10,01,70,90},
            {9,8,7,7},
            {3,2,1,0}};
        int contador = 0;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if(matriz1[i][j] > 10){
                    contador++;
                }
            }
        }

        System.out.println(contador);

        
    }  
}
