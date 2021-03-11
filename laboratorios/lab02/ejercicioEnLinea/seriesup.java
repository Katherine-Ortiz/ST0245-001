public class array3{

    public int[] seriesUp(int n) {
        int []f = new int[n*(n+1)/2];  
            int i = 0; 
                for(int j = 1;j <= n; j++) 
                    for(int p = 1; p <= j ; p++) 
                        f[i++] = p; 
            return f;
        }
    }