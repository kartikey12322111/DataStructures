package Arrays;

public class SortArrayParity2 {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even = 0; 
        int odd = 1;  

        while (even < n && odd < n) {
            if (nums[even] % 2 == 1) {

                if (nums[odd] % 2 == 0) {
                    int temp = nums[even];
                    nums[even] = nums[odd];
                    nums[odd] = temp;

                    even += 2;
                    odd += 2;
                } else {
                    odd += 2; 
                }
            } else {
                even += 2; 
            }
        }

        return nums;
    }
}
