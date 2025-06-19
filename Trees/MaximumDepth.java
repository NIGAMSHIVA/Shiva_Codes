package Trees;

import java.util.Stack;
import java.util.*;

class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int val) {

        this.val = val;

    }
}

public class MaximumDepth {

    public static int maxDepth(TreeNode root) {

        int max = Integer.MIN_VALUE;

        Stack<Pair<TreeNode, Integer>> st = new Stack<>();
        st.push(new Pair<>(root, 1));

        while (!st.isEmpty()) {
            Pair<TreeNode, Integer> pair = st.pop();

            TreeNode curr = pair.getKey();
            int val = pair.getValue();

            max = Math.max(val, max);

            if (curr.left != null) {
                st.add(new Pair<>(curr.left, val + 1));
            }
            if (curr.right != null) {
                st.add(new Pair<>(curr.right, val + 1));
            }

        }
        return max;

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(7);

        System.out.println(maxDepth(root));

    }

}
