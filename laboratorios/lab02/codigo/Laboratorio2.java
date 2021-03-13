public class Laboratorio2{
// Toro,M(2020) MergeSort (Version 1.0) [Source code] https://github.com/mauriciotoro/ST0245-Eafit/tree/master/laboratorios/lab02
public static void mergeSort(int [ ] a){
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}

	private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}

    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)   
            tmp[k++] = a[left++];

        while(right <= rightEnd)  
            tmp[k++] = a[right++];

        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }

    public static void main(String[] args){
     
        for(int n = 8000000; n <= 28000000; n = n + 1000000){
            int[] arreglo = new int[n];
            System.out.println(n);
            arreglo = generarArreglo(n);
            long ti = System.currentTimeMillis();
            Laboratorio2.mergeSort(arreglo);
            long tf = System.currentTimeMillis();
            System.out.println("El tiempo de mergeSort es: "+(tf - ti)+ " en ms");
  

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
