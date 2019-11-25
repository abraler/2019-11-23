//给定一个二叉树，检查它是否是镜像对称的
class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main2 {
    public boolean isSymmetric(TreeNode root) {
        return  macth(root,root);
    }
    public boolean macth(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return (q.val==p.val)&&macth(p.left,q.right)&&macth(q.right,p.left);
    }
}