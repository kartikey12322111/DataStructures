public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                count++;
            }
            int mul= nums[i];
            for(int j=i+1;j<nums.length;j++){
                mul = mul * nums[j];
                if(mul<k){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}
