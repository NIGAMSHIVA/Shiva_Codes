package Trees;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {

        // Changes

        // hereeee

         function(root);
         return root;
    }

     public static void function(TreeNode root){

        Queue<TreeNode> st=new LinkedList<>();

        st.add(root);

        while(!st.isEmpty()){

            TreeNode T1=st.poll();

            if(T1==null)
            return ;

            TreeNode dummy=T1.right;
            T1.right=T1.left;
            T1.left=dummy;

            if(T1.left!=null)
                st.add(T1.left);
            if(T1.right!=null)
                st.add(T1.right);
            
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        invertTree(root);
    }
}
