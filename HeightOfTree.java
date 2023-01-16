package Tree;

public class HeightOfTree {

    int height(Node n){
        if(n==null) {
            return 0;
        }
         return Math.max(height(n.left),height(n.right))+1;
    }
    /**
     * Time complexity O(n)
     * Space complexity :number of nodes in tack ata  time =height of tree=h+1:O(h)
     */
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        //empty tree
        Node root1=null;
        HeightOfTree HeightOfTree=new HeightOfTree();

        System.out.println(HeightOfTree.height(root));
    }
}
