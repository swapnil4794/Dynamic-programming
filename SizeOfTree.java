package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfTree {
    int sizeOfTree(Node n){
        if(n==null) {
            return 0 ;
        }
return sizeOfTree(n.left)+sizeOfTree(n.right)+1;
    }
        int SizeOfTreeMethod2(Node n){
            if (n == null) return 0;
            Queue<Node> q = new LinkedList<Node>();
            q.add(n);
            int count = 0;
            while (!q.isEmpty()) {
                Node curr = q.poll();
                count++;
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            return count;
        }
    /**
     * Time complexity O(n)
     * Space complexity :O(h):no of elements at a time=height of tree
     */
    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        //empty tree
        Node root1 = null;
        SizeOfTree SizeOfTree = new SizeOfTree();

        System.out.println(SizeOfTree.sizeOfTree(root));
        System.out.println(SizeOfTree.SizeOfTreeMethod2(root));
    }
}
