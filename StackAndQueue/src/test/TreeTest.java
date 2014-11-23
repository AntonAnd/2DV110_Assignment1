package test;

import main.Tree;
import main.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * This class contains test methods for testing the Tree class.
 * Created by Johan Widen on 2014-11-20.
 */
public class TreeTest {

    private Tree<Integer> tree;
    private TreeNode<Integer> tInt;


    @Before
    public void init() {
        tInt = mock(TreeNode.class);
    }

    @Test
    public void testConstructor(){
        new Tree<>(tInt);
    }

    @Test
    public void testRoot(){
        tree = new Tree<>(tInt);
        Assert.assertEquals(tInt, tree.root());
    }
}
