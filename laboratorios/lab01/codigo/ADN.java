public class ADN{
     
    /*
     * Metodo que se encarga de calcular la cadena comun más larga entre dos strings.
     * @param string1 Primer string
     * @param string2 Segundo string 
     * @return tamaño de la cadena comun más larga.
     */
    public static int lcsDNA(String stringA, String stringB){
        return lcsDNAAux(stringA,stringB,stringA.length(),stringB.length());

    }
    /*
     * Metodo auxiliar para lcsDNA
     * @param string1 Primer string
     * @param string2 Segundo string
     * @param m tamaño de string 1
     * @param n tamaño de string 2
     * @return tamaño de la cadena comun más larga.
     */
    private static int lcsDNAAux(String stringA, String stringB,int m,int n) {
        if (m<=0||n<=0)
        {
            return 0;
        }

        else if(stringA.charAt(m-1)==stringB.charAt(n-1)){
            return 1 + lcsDNAAux(stringA.substring(0,m-1),stringB.substring(0,n-1),
            stringA.substring(0,m-1).length(),stringB.substring(0,n-1).length());
        }
        return Math.max(lcsDNAAux(stringA.substring(0,m-1),stringB,stringA.substring(0,m-1).length(),n), 
        lcsDNAAux(stringA,stringB.substring(0,n-1),m,stringB.substring(0,n-1).length()));
    }
}