import java.util.ArrayList;
import java.util.List;
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int num : nums) {
            if (temp.contains(num)) continue; // skip used elements
            
            temp.add(num);                    // choose
            backtrack(result, temp, nums);    // explore
            temp.remove(temp.size() - 1);     // backtrack
        }
    }
}