package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
    /**
     * Time complexity O(n)
     * Space complexity :O(n)/o(w):w=width
     */
    int count(Node n) {
        if (n == null) {
            return 0;
        }
        return 1+count(n.left)+count(n.right);

    }

    /**
     * Time complexity O(n)
     * Space complexity :O(n)/o(w):w=width
     */
    int countMethod2(Node n) {
        int lh=0;
        int rh=0;
        Node curr=n;
        while (curr != null) {
            lh++;
            curr=curr.left;
        }
        curr=n;
        while (curr != null) {
            rh++;
            curr=curr.right;
        }
if(lh==rh) return (int) (Math.pow(2,lh)-1);
        return 1+count(n.left)+count(n.right);

    }
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        //empty tree
        Node root1=null;
        CountNodes LevelOrderTraversal=new CountNodes();

        System.out.println(LevelOrderTraversal.count(root));
        System.out.println(LevelOrderTraversal.countMethod2(root));
    }
}
