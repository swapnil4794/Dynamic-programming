package Tree;

public class DiameterOfTree {

    /**
     * Time complexity O(n)
     * Space complexity :number of nodes in stack at a  time =height of tree=h+1:O(h)
     */
int res=0;
    int diameterMethod2(Node n){
        if(n==null) {
            return 0;
        }
        int lh=diameterMethod2(n.left);
        int rh=diameterMethod2(n.right);
        res= Math.max(res, lh+rh+1);
        return 1+Math.max(lh,rh);
    }

    void height(Node n){
        diameterMethod2(n);
        System.out.println(res);
    }

    /**
     * Time complexity O(n square)
     * Space complexity :number of nodes in tack ata  time =height of tree=h+1:O(h)
     */

    int diameter(Node n){
        if(n==null) {
            return 0;
        }
        HeightOfTree height=new HeightOfTree();
        int d1=height.height(n);
        return Math.max(d1, Math.max(diameter(n.left), diameter(n.right)));
    }

    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        //empty tree
        Node root1=null;
        DiameterOfTree HeightOfTree=new DiameterOfTree();
     HeightOfTree.height(root);

    }
}