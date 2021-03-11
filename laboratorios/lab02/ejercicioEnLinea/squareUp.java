public class array3{

    public int[] squareUp(int n){
        int[] resultado = new int[n * n];
        int p = 1, index = 0;
            if(n == 0){ 
                return resultado; 
            }
            for(int i = n-1; i < resultado.length; i+=n) {
                index = i;
                for(int k = 1; k <= p; k++){
                    resultado[index] = k;
                    index--;
                }
             p++;
            }
         return resultado;
    }
}