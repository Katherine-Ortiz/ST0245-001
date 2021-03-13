public class Laboratorio_2{
    public static void Sort(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; ++i) 
        {
            int key = arr[i]; 
            int j = i-1; 
            while (j>=0 && arr[j] > key) 
            {
                arr[j+1] = arr[j]; 
                j = j-1; 
            arr[j+1] = key; 
        }
    }
   }

   
public static void main(String[] args){

      for(int n = 50000; n <= 25000; n = n + 1000){
        int[] arreglo = new int[n]; 
        System.out.println(n);
        arreglo = generarArreglo(n);
        long ti = System.currentTimeMillis();
        Laboratorio_2.Sort(arreglo);
        long tf = System.currentTimeMillis();
        System.out.println("EL tiempo de insertionSort es: "+(tf - ti)+ " en ms");
        }
    }
    
    public static int [] generarArreglo(int n) {
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.round(Math.random()*10);
        }
        return arr;
}
}

