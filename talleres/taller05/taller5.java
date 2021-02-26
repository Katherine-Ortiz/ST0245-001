import java.util.Arrays;
import java.util.Random;

public class taller5 {


    public static void main(String[] String) {
        int size = 120;
        int[] array;
        for (int a = 300; a < size; a++) {
            array = generarArreglo(size);
            long inicio = System.currentTimeMillis();
            System.out.println(suma(array));
            long fin = System.currentTimeMillis();
            long total = fin - inicio;
            System.out.println("el tiempo fue de " + total + " ms");
        }
        
        int[] arr;
        for (int a = 0; a < size; a++) {
            arr = generarArreglo(size);
            long inicio = System.currentTimeMillis();
            System.out.println(Arrays.toString(arr));
            sort(arr);
            System.out.println(Arrays.toString(arr));
            long fin = System.currentTimeMillis();
            long total = fin - inicio;
            System.out.println("alv sdoweo " + total + " ms");


        }
    }

    /**
     * @param array es una arreglo de numeros enteros.
     * El método suma tiene la intención de hacer el proceso de suma
     * mediante una funcion cíclica (while/for/...)
     * @return la suma de todos los numeros sumados.
     */
    public static int suma (int[]array){
        int suma = 0;
        for(int i = 0; i < array.length; i++){
            suma+= array[i];
        }
        return suma;
    }


    /**
     * @param arr es un arreglo de números desordenados
     * El método insertionSort tiene la intención ordenar los números
     * del arreglo array por el método insertion:
     * @see <a href="https://www.youtube.com/watch?v=OGzPmgsI-pQ"> Insertion Sort <a/>
     * mediante la anidación de funciones cíclicas (while/for/...)
     *
     * @return
     */
    public static void sort(int[] arr)
    {
        int n = arr.length; // C1 es O(1)
        for (int i=1; i<n; ++i) // C2 + C3*n es O(n)
        {
            int key = arr[i]; // C4*n es O(n)
            int j = i-1; // C5*n es O(n)
            while (j>=0 && arr[j] > key) // 1 + 2 + 3 + 4 + 5 + .. n = n(n+1)/2 es O(n*n)
            {
                arr[j+1] = arr[j]; // 1 + 2 + 3 + 4 + 5 + .. n = n(n+1)/2 es O(n*n)
                j = j-1; // 1 + 2 + 3 + 4 + 5 + .. n = n(n+1)/2 = n*n/2 + n/2 es O(n*n)
            }// n*n/2 + n/2 es O(n*n/2 + n/2) es O(n*n/2) es O(n*n)
            arr[j+1] = key; // C6*n es O(n), por regla del producto O(c.f) = O(f)
        }
        // T(n) = O(1) + O(n) + O(n*n) = O(n*n)

    }

    public static int[] generarArreglo(int size) {
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.round(Math.random());
        }
        return arr;
    }
}