package main;

/**
 * This is our class representing a Tree implementation.
 * Created by Johan Widen on 2014-11-20.
 */
public class Tree<E> {

    private TreeNode<E> root;
    private int size = 1;

    /**
     * Constructor that takes an TreeNode, that will be the root of the tree, as parameter.
     * @param rootNode The root node of the Tree.
     */
    public Tree(TreeNode<E> rootNode) {
        this.root = rootNode;
    }

    /**
     * Returns the root of the tree.
     * @return TreeNode that are the root for the this tree.
     */
    public TreeNode<E> root() {
        return root;
    }

    public int size() {
        return size;
    }
}
