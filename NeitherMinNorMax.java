import java.util.Arrays;

public class NeitherMinNorMax {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=2){
            return -1;
        }
        return nums[1];
    }
}
