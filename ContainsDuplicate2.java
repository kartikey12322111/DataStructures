
import java.util.HashSet;

public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 obj = new ContainsDuplicate2();

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        System.out.println(obj.containsNearbyDuplicate(nums, k));
    }
}

