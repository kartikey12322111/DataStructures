public class MaximumAverageSubArr1 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        int i = 0;
        for (; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}
