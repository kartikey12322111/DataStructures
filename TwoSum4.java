import java.util.ArrayList;
import java.util.List;

public class TwoSum4 {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        inorder(root, values);

        int left = 0, right = values.size() - 1;
        while (left < right) {
            int sum = values.get(left) + values.get(right);
            if (sum == k) return true;
            else if (sum < k) left++; 
            else right--;  
        }
        return false;
    }

    private void inorder(TreeNode node, List<Integer> values) {
        if (node == null) return;
        inorder(node.left, values);
        values.add(node.val);  
        inorder(node.right, values);
    }
    
}
}
