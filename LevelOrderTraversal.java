package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    void printlevel(Node n){
        if(n==null) {
            return ;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(n);
        while(!q.isEmpty()) {
            Node curr=q.poll();
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            System.out.println(curr.key);
        }
    }
    /**
     * Time complexity O(n)
     * Space complexity :O(n)/o(w):w=width
     */
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        //empty tree
        Node root1=null;
        LevelOrderTraversal LevelOrderTraversal=new LevelOrderTraversal();

        LevelOrderTraversal.printlevel(root);
    }
}
