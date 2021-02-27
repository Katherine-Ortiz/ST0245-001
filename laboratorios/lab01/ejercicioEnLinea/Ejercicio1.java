
public class Ejercicio1
{
   public boolean splitArray(int[] nums) {
  
        return splitArrayAux(0,nums,0,0);
    }

    public boolean splitArrayAux(int index, int[] nums, int sum1, int sum2)
    {
        if(index>=nums.length)
          return(sum1==sum2);
          
        return splitArrayAux(index+1,nums,sum1+nums[index],sum2)||splitArrayAux(index+1,nums,sum1,sum2+nums[index]);
    }
      
        
      
}

