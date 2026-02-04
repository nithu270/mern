public class avl{
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val = data;
        }
        avl(){
            this.root = null;
        }

        private int height(TreeNode root){
            if(root==null){
                return -1;
            }
            int left = height(root.left);
            int right = height(root.right);
            return 1+Math.max(left,right);
        }
        private TreeNode insert(TreeNode root){
            if(root==null){
                return new TreeNode(val);
            }
        }
        TreeNode rotateright(TreeNode p){

        }
        TreeNode rotateleft(TreeNode c){
            
        }
        TreeNode rotate(TreeNode root){
            if(height(root.left)-height(root.right)>1){
                    if((height(root.left.left))-height(root.left.right)<0){
                            root.left = rotateleft(root.left);
                            return rotateright(root);
                    }
                    else{
                        root.right = rotateright(root.right);
                        return rotateleft(root);
                    }
            }
            //right
            if(height(root.left)-height(root.right)<-1){
                //right-right
                if(height(root.right.left)-height(root.right.right)<0){
                    return rotateleft(root);
                }
                else if(height(root.right.left)-height(root.right.right)>0){
                    return rotateright(root.right);
                    return rotateright(root);
                }
                
            }
        }
    }
}