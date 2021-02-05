public class Taller2 {
	
	public static int gcd(int p, int q){
	        if (p % q == 0)
               return q;
            return gcd(q, p % q) 
	}

    public static boolean SumaGrupo(int[] nums, int target) {
        return SumaGrupo(0, nums, target);
	

	
    private static boolean SumaGrupo(int start, int[] nums, int target){
        if (start == nums.length)
            if (target == 0)
                return true;
            else
                return false;
        //else
        boolean respuestaSi = SumaGrupo(start+1,nums,target - nums[start]);
        boolean respuestaNo = SumaGrupo(start+1,nums,target);
        return respuestaSi || respuestaNo;
    }
	
	/**
	* @param s se trata de una cadena de caracteres sobre la cual hallaremos las posibles combinaciones.
	*
	* El método combinations se define para que solo se tenga que pasar el parametro s y no la cadena 
	* vacía necesaria para el metodo reursivo combinationsAux. Este metodo no se modifica.
	* 
	*/
	public static void combinations(String s) { 
		combinationsAux("", s); 
	}
	
    public static void combinationsAux (String prefix, String s){
        if (s.length()==0){
            System.out.println(prefix);
        } else {
            combinationsAux(prefix, s.substring(1));
            combinationsAux(prefix + s.charAt(0), s.substring(1));
        }
    }
}