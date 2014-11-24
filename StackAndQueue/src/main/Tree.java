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

    /**
     * Returns the number of nodes in the tree.
     * @return number of nodes the tree.
     */
    public int size() {
        return size;
    }

    /**
     * Add a child to the parent node. If parent is null then add the child to the root.
     * @param parent the TreeNode that the child shall belongs to, if null then the child will be added to the root.
     * @param child the TreeNode that we add to the parent.
     */
    public void addChild(TreeNode<E> parent, TreeNode<E> child) {
        if (child == null) {
            throw new NullPointerException("Child can not be null");
        }
        if (parent == null) {
            root.getChildren().add(child);
        } else {
            parent.getChildren().add(child);
        }
        size++;
    }
}
