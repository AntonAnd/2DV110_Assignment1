package main;

/**
 * This is our class representing a Tree implementation.
 * Created by Johan Widen on 2014-11-20.
 */
public class Tree<E> {

    private TreeNode<E> root;

    /**
     * Constructor that takes an TreeNode, that will be the root of the tree, as parameter.
     * @param rootNode The root node of the Tree.
     */
    public Tree(TreeNode<E> rootNode) {
        this.root = rootNode;
    }
}
