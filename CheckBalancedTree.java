package Tree;

public class CheckBalancedTree {
//Naive approach
    boolean checkbalance(Node n){
        if(n==null || (n.left==null && n.right==null)){
            return true;
        }
        HeightOfTree HeightOfTree=new HeightOfTree();
         return Math.abs(HeightOfTree.height(n.left)-HeightOfTree.height(n.right))<2
                 && checkbalance(n.left) && checkbalance(n.right);
    }

    //good approach
    int  checkbalanceMethod2(Node n){
        if(n==null){
            return 0;
        }
        int lh=checkbalanceMethod2(n.left);
        if (lh==-1) return -1;
        int rh=checkbalanceMethod2(n.right);
        if (rh==-1) return -1;
        if(Math.abs(lh-rh)>=2) return -1;
        else return Math.max(lh,rh)+1;
    }
    /**
     * Time complexity O(n square)
     * Space complexity :number of nodes in stack at a  time =height of tree=h+1:O(h)
     */
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(20);
       root.right=new Node(30);
        root.right.left=new Node(40);
        //root.left.right=new Node(40);
        root.right.right=new Node(30);
        //root.right.right.left=new Node(30);
        //empty tree
        Node root1=null;
        CheckBalancedTree CheckBalancedTree=new CheckBalancedTree();

        System.out.println(CheckBalancedTree.checkbalance(root));
        System.out.println(CheckBalancedTree.checkbalanceMethod2(root)!=-1?true:false);
    }
}
