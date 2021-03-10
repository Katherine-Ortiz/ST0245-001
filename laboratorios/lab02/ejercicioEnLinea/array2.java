public class array2 {

    public boolean sum28(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
          if(nums[i] == 2){
            sum += nums[i];
          }
        }
        if(sum == 8){
          return true;
        }
        else{
          return false;
        }
      } // complejidad O(n)
      public boolean more14(int[] nums) {
        int contador = 0, contador2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
          if(nums[i] == 1){
            contador++;
          }
          if(nums[i] == 4){
            contador2++;
          }
        }
        if(contador > contador2){
          return true;
        }
        return false;
      } // complejidad O(n)

      public boolean only14(int[] nums) {
        int contador=0;
        for(int i = 0 ; i < nums.length ; i++){
          if(nums[i]== 1){
            cont++;
          }
          if(nums[i]== 4){
            contador++;
          }
        }
        if(cont == nums.length){
          return true;
        }
        return false;
      }// complejidad O(n)
      public  boolean  has12 ( int [] nums ) {
        booleano bool=  falso ; 
        booleano bool1 =  falso ; 

        para ( int i =  0 ; i < núm . longitud; i ++ ) { 
            if (números [i] ==  1 ) 
                bool =  verdadero ;   

            if (números [i] ==  2  && f) 
                bool1 =  verdadero ;    
        }
        return bool1;  // complejidad O(n)
        public boolean has22(int[] nums) {
  
            for(int i = 0;i<nums.length-1;i++)
            {
              if(nums[i]==2&&nums[i+1]==2)
              {
                return true;
              }
            }
            return false; // complejidad O(n)
        }
}
