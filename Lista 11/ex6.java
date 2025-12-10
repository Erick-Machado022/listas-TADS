public class ex6 {
    public static void main(String[] args) {
        
        int [][] matriz0 = {
            {1,2,3,4},
            {2,3,15,5},
            {3,4,5,6},
            {6,7,8,9}
        };

        int [] [] matriz1 = {
            {01,02,30,04},
            {10,01,70,90},
            {9,8,7,7},
            {3,2,1,0}
        };

        int [] [] matriz2 = new int[4][4];

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                if(matriz0[i][j] > matriz1[i][j]){
                    matriz2[i][j] = matriz0[i][j];
                }else{
                    matriz2[i][j] = matriz1[i][j];
                }
            }            
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
