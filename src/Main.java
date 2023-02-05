public class Main {
    public static void main(String[] args)
    {
        //variable to hold the height of the tree
        int height = 2;

        //build the tree
        TreeNode tree = Tree.perfectBinaryTree(height);

        //print tree
        Tree.printInOrder(tree);
    }
}