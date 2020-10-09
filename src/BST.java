//
///*
//Binary Search Tree
//insertnode
//inorder traversal
//preorder traversal
//postorder traversal
//levelorder traversal
//print leaf nodes
//height_of_tree
//Depth_of_tree
//delete leaf nodes
//*/
//import java.util.*;
////class Node
////{
////    int data;
////    Node left;
////    Node right;
////    Node(int data)
////    {
////        this.data = data;
////        left = null;
////        right = null;
////    }
////}
//class bst
//{
//    int closest;
//    public Node insertnode(Node root,int data)
//    {
//        if(root == null)
//        {
//            return new Node(data);
//        }
//        else
//        {
//            if(data < root.data)
//            {
//                root.left = insertnode(root.left,data);
//            }
//            else
//            {
//                root.right = insertnode(root.right,data);
//            }
//        }
//        return root;
//    }
//    public void inorderRec(Node root)
//    {
//        if (root != null)
//        {
//            //System.out.println(root.data);
//            inorderRec(root.left);
//            System.out.print(root.data + " ");
//            inorderRec(root.right);
//        }
//    }
//
//    public void postorder(Node root,int a)
//    {
//        if(root != null)
//        {
//            postorder(root.left,a);
//            postorder(root.right,a);
//            System.out.print(root.data  + " ");
//
//
//        }
//    }
//
//    public void preorder(Node root)
//    {
//        if(root != null)
//        {
//            System.out.print(root.data + " ");
//
//            preorder(root.left);
//            preorder(root.right);
//        }
//    }
//
//    public Node deleteleafnode(Node root)// delete leaf nodes
//    {
//        if(root == null)
//        {
//            return null;
//        }
//
//        if((root.left == null) && (root.right == null))
//        {
//            root = null;
//        }
//        else
//        {
//            root.left  = deleteleafnode(root.left);
//            root.right = deleteleafnode(root.right);
//        }
//
//        return root;
//    }
//
//    int sum = 0;
//    public void printleaf(Node root)
//    {
//        if (root == null)
//        {
//            return;
//        }
//        //System.out.print("-"+root.data+" ");
//        if (root.left == null && root.right == null)
//        {
//            System.out.printf("%d ", root.data);
//            //sum = sum++;
//        }
//        printleaf(root.left);
//        printleaf(root.right);
//    }
//
//    public void printPath(Node root) {
//        int path[] = new int[1000];
//        printPathRecursively(root,path,0);
//        printPathRecursively(root.left,path,0);
//        printPathRecursively(root.right,path,0);
//    }
//
//    static void printPathRecursively(Node root,int path[],int pathLength) {
//        if(root == null) {
//            return;
//        }
//
//        path[pathLength] = root.data;
//        pathLength++;
//        //System.out.println(" arr len = "+pathLength);
//        if (root.left == null && root.right == null)
//            printArray(path, pathLength);
//        else
//        {
//            printPathRecursively(root.left, path, pathLength);
//            printPathRecursively(root.right, path, pathLength);
//        }
//    }
//
//    static void printArray(int ints[], int len)
//    {
//        for (int i = 0; i < len; i++)
//        {
//            System.out.print(ints[i] + " ");
//        }
//        System.out.println("");
//    }
//
//    public int height_of_tree(Node root)
//    {
//        int maxheight = 0;
//        int minheight = 0;
//        if(root == null)
//        {
//            return -1;
//        }
//        else
//        {
//            maxheight += height_of_tree(root.left);
//            minheight += height_of_tree(root.right);
//        }
//        return 1+Math.max(maxheight,minheight);
//    }
//
//    public int depth_of_tree(Node root)
//    {
//        int maxheight = 0;
//        int minheight = 0;
//        if(root == null)
//        {
//            return -1;
//        }
//        else
//        {
//            maxheight += height_of_tree(root.left);
//            minheight += height_of_tree(root.right);
//        }
//        return 1+Math.min(maxheight,minheight);
//    }
//    public boolean printlevel(Node root,int level)
//    {
//        if(root == null)
//        {
//            return false;
//        }
//
//        if(level == 1)
//        {
//            System.out.print(root.data + " ");
//            return true;
//        }
//        boolean left  = printlevel(root.left,level-1);
//        boolean right = printlevel(root.right,level-1);
//
//        return left || right;
//    }
//
//    public void levelorder(Node root)
//    {
//        int level=1;
//        while(printlevel(root,level))
//        {
//            level++;
//        }
//    }
//
//    public void getCloset(Node root,int targetValue) {
//
//        int diff = Math.abs(root.data-targetValue);
//        int closestValue = root.data;
//        System.out.println("closest value of 12 = "+getClosetAlgo(root,targetValue,diff,closestValue));
//    }
//
//    public int getClosetAlgo(Node root,int targetValue,int diff,int closestValue){
//
//        if(root != null) {
//            getClosetAlgo(root.left,targetValue,diff,closestValue);
//            getClosetAlgo(root.right,targetValue,diff,closestValue);
//            int toCheck = root.data;
//            if(toCheck-targetValue < 0) {
//                if(targetValue-toCheck < diff) {
//                    diff =  targetValue-toCheck;
//                    closestValue = toCheck;
//                    closest = closestValue;
//                }
//            } else if(toCheck-targetValue > 0) {
//                if(toCheck-targetValue < diff) {
//                    diff =  toCheck-targetValue;
//                    closestValue = toCheck;
//                    closest = closestValue;
//                }
//            } else {
//                //
//            }
//        }
//        return closest;
//    }
//
//    public void swapNode(Node root) {
//        if(root!=null) {
//            swapNode(root.left);
//            int temp = root.data;
//            swapNode(root.right);
//            int temp1 = root.data;
//            root.data = temp;
//        }
//    }
//}
//
//class trees
//{
//    public static void main(String[] args)
//    {
//        bst ob = new bst();
//        Node root = null;
//        root = ob.insertnode(root,10);
//        root = ob.insertnode(root,15);
//        root = ob.insertnode(root,2);
//        //root = ob.insertnode(root,13);
//        //root = ob.insertnode(root,14);
//        //root = ob.insertnode(root,5);
//        //root = ob.insertnode(root,5);
//        //root = ob.insertnode(root,2);
//
//        //root = ob.insertnode(root,1);
//
//        System.out.println("root.data = "+root.data);
//
//        System.out.println("in order = ");
//        ob.inorderRec(root);
//
//
//        System.out.println("swap nodes");
//        ob.swapNode(root);
//
//        System.out.println("in order = ");
//        ob.inorderRec(root);
//        //System.out.println();
//
//        //System.out.println("post order = ");
//        //ob.postorder(root,2);
//
//        //System.out.println();
//
//        //System.out.println("pre order = ");
//        //ob.preorder(root);
//
//        //System.out.println();
//
//        //System.out.println("Level order = ");
//        //ob.levelorder(root);
//
//        //System.out.println();
//        //System.out.println();
//        //System.out.println("print leaf nodes = ");
//        //ob.printleaf(root);
//
//        //System.out.println();
//
//        //System.out.println("Height of the tree "+ob.height_of_tree(root));
//
//        //System.out.println();
//
//        //System.out.println("depth of the tree = "+ob.depth_of_tree(root));
//
//        //System.out.println();
//        //ob.deleteleafnode(root);
//
//        //System.out.println("Levelorder After deletion of leaf nodes = ");
//        //ob.levelorder(root);
//
//        //ob.getCloset(root,12);
//        //System.out.println("print Paths = ");
//        //ob.printPath(root);
//
//    }
//}