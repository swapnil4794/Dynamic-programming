package Tree;

import java.util.Stack;

public class IterativeInorderTraversal {
    void inorderTraversal(Node n) {
        Node curr = n;
        Stack<Node> s = new Stack<>();
        while (curr != null || !s.isEmpty()) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            System.out.println(curr.key);
            curr = curr.right;
        }

    }

    /**
     * Time complexity O(n)
     * Space complexity :number of nodes in stack at a  time =height of tree=h+1:O(h)
     */
    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        //empty tree
        Node root1 = null;
        IterativeInorderTraversal DepthTraversalInorder = new IterativeInorderTraversal();

        DepthTraversalInorder.inorderTraversal(root);
    }

}
