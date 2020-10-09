public class BinaryTree {

    private TreeNode rootNode;

    static class TreeNode{
        int data;
        TreeNode leftNode;
        TreeNode rightNode;
        TreeNode(int data) {
            this.data = data;
        }
    }

    public TreeNode insertNode(int value) {

        if(rootNode == null) {
            return new TreeNode(value);
        }
        else {
            if(value <= rootNode.data) {
                rootNode.leftNode = insertNode(value);
            } else {
                rootNode.rightNode = insertNode(value);
            }
            return rootNode;
        }
    }

    public void preorderTraversal(TreeNode rootNode) {
        System.out.println("1");
        if(rootNode != null) {
            System.out.println(rootNode.data+" ");
            preorderTraversal(rootNode.leftNode);
            preorderTraversal(rootNode.rightNode);
        }
    }

    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();
        obj.insertNode(3);
        obj.insertNode(4);
        obj.insertNode(5);
        obj.insertNode(7);
        obj.insertNode(8);
        obj.insertNode(1);
        obj.insertNode(2);
        obj.insertNode(98);
        obj.insertNode(65);
        obj.insertNode(89);
        obj.insertNode(31);

        obj.preorderTraversal(obj.rootNode);
    }
}
