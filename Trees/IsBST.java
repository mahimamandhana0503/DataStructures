package Trees;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class IsBST {
    boolean isBST(Node root)
    {
        return BSTCheck(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    boolean BSTCheck(Node root, int min, int max) {
        if(root == null) {
            return true;
        }
        if(root.data > max || root.data < min) {
            return false;
        }
        return BSTCheck(root.left, min, root.data-1) && BSTCheck(root.right, root.data+1, max);
    }
}
