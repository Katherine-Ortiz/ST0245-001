public class array3{

    public boolean linearIn(int[] outer, int[] inner){
        int num = 0; 
        int p = 0;
            if(inner.length == 0){ 
                return true; 
            }
            for(int i = 0; i< outer.length; i++){ 
                if(outer[i] == inner[p]){ 
                    num++; 
                    p++;  
                }else if(outer[i] > inner[p]){ 
                    return false; 
                }
                if(inner.length == num){ 
                    return true; 
                }
            }
        return false;
    }
}