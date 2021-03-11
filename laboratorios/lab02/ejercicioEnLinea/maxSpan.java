public class array3{

    public int maxSpan(int[] nums){
        int num= 0;
            for (int i = 0; i < nums.length; i++){
                int j = nums.length - 1;
                    for (;; j--){
                        if (nums[j] == nums[i]){
                            break;
                        }
                    }
                    int sp = j - i + 1;
                        if (sp > num){
                            num = sp;
                        }
                    }
        return num;
    }
}