
public class Ejercicio3
{
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if(start>=nums.length)
          return(target==0);
        if(groupNoAdj(start+2,nums,target-nums[start])||groupNoAdj(start+1,nums,target))
          return true;
          
        return false;
    }
}
