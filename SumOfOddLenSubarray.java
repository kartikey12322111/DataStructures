public class SumOfOddLenSubarray {
    public int sumOddLengthSubarrays(int[] arr) {
        return i(arr,0);
    }
    int i(int[] arr,int start){
        if(start == arr.length)return 0;
        int sum = 0;
        int curr = 0;
        for(int i=start;i<arr.length;i++){
            curr += arr[i];
            if ((i - start + 1) % 2 == 1) {
                sum += curr;
            }
        }
        return sum + i(arr, start + 1);
    }
}
