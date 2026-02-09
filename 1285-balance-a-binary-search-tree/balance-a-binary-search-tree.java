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
     List<Integer> inorderList =new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
       
                inorder(root);
                return BBST(0,inorderList.size()-1);
        }
        public void inorder(TreeNode root){
            if(root==null)return ;
            inorder(root.left);
 inorderList.add(root.val);
             inorder(root.right);

        }
        private TreeNode BBST(int left,int right){
            if(left>right) return null;

            int mid=left+(right-left)/2;
            TreeNode root=new TreeNode(inorderList.get(mid));
            root.left=BBST(left,mid-1);
            root.right=BBST(mid+1,right);
            return root;
        }
        
    }
