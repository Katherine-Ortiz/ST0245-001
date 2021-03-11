public class array2 {
        
    public boolean more14(int[] nums){
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
        }
    }