public class array3{

    public boolean canBalance(int[] nums){
        int suma1=0;
            for (int i =0;i<nums.length;i++){
                suma1+=nums[i];
                int suma2=0;
                    for(int j =nums.length-1;j>i;j--){
                        suma2+=nums[j];
                    }
                        if(suma1==suma2){
                        return true;
                        } 
            }
            return false;
    }
}