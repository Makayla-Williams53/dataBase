import java.util.LinkedList;
import java.util.Queue;

//class to create the perfect binary tree
public class Tree
{
    //constructor
    public static TreeNode perfectBinaryTree(int depth)
    {
        //depth is the variable that determines the height of the tree
        if(depth == 0)
        {
            //if the tree has no height return a zero
            return new TreeNode(0);
        }

        //create and initialize a queue to hold the nodes on each level
        Queue<TreeNode> queue = new LinkedList<>();

        //create a root node with the value of 16
        int i = 0;
        TreeNode root = new TreeNode(i);

        //add the root to the queue
        queue.add(root);

        //go through the queue until it's empty
        while(!queue.isEmpty())
        {
            //check the size of the queue
            int size = queue.size();

            //increment through each node on the level
            i++;

            //stop loop if the value of the node is the depth
            if(i > depth)
            {
                break;
            }//end if
            else
            {
                //create a left and right child
                for(int j = 0; j < size; j++)
                {
                    //remove the current node from the queue
                    TreeNode node = queue.remove();
                    //add left child
                    node.left = new TreeNode(i);
                    //add right child
                    node.right = new TreeNode(i);

                    //add the children to the queue
                    queue.add(node.left);
                    queue.add(node.right);
                }//end for loop
            }//end else
        }//end while loop

        return root;
    }//end constructor

    //print out tree (goes left, root, then right)
    public static void printInOrder(TreeNode node)
    {
        //if the node is null return nothing
        if(node == null)
        {
            return;
        }//end if
        //recursion to go the furthest left as possible
        printInOrder(node.left);
        //print out the value
        System.out.print(node.value + " ");
        //recursion to go the furthest right on the same level and do the same thing
        printInOrder(node.right);
    }//end printInOrder

}//end PerfectBinaryTree class
