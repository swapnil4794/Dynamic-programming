package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfTree {
    int maxWidth(Node n) {
        if (n == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(n);
        int count = 0;
        int max = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            count = q.size();
            if (max < count) max = count;
            for (int i = 0; i < count; i++) {

                Node curr = q.poll();

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return max;
    }

    /**
     * Time complexity O(n)
     * Space complexity :o(w):w=width
     */
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(40);
        root.right.left=new Node(40);
        root.right.right=new Node(40);
        //empty tree
        Node root1=null;
        MaxWidthOfTree LevelOrderTraversal=new MaxWidthOfTree();

        System.out.println(LevelOrderTraversal.maxWidth(root));
    }
}
