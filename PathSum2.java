import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, new ArrayList<>());
        return result;
    }

    private void dfs(TreeNode node, int targetSum, List<Integer> path) {
        if (node == null) return;

        path.add(node.val);

        if (node.left == null && node.right == null && targetSum == node.val) {
            result.add(new ArrayList<>(path));
        }

        dfs(node.left, targetSum - node.val, path);
        dfs(node.right, targetSum - node.val, path);

        path.remove(path.size() - 1); 
    }
}
