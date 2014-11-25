package test;

import main.Tree;
import main.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * This class contains test methods for testing the Tree class.
 * Created by Johan Widen on 2014-11-20.
 */
public class TreeTest {

    private Tree<Integer> tree;
    private TreeNode<Integer> tInt;
    private TreeNode<Integer> n1;


    @Before
    public void init() {
        tInt = mock(TreeNode.class);
        n1 = new TreeNode<>(5);
        tree = new Tree<>(tInt);
    }

    @Test
    public void testConstructor(){
        new Tree<>(tInt);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor2(){
        new Tree<>(null);
    }

    @Test
    public void testRoot(){
        Assert.assertEquals(tInt, tree.root());
    }

    @Test
    public void testSize(){
        Assert.assertEquals(1, tree.size());
    }

    @Test
    public void testAddChild(){
        tree.addChild(tree.root(), new TreeNode<>(5));
        Assert.assertEquals(2, tree.size());
    }

    @Test
    public void testGetChild(){
        tree = new Tree<>(new TreeNode<>(2));
        tree.addChild(tree.root(), n1);
        TreeNode<Integer> n2 = new TreeNode<>(3);
        tree.addChild(n1, n2);
        Assert.assertEquals(n2, tree.root().getChildren().get(0).getChildren().get(0));
    }

    @Test
    public void testGetChildWithNullParent(){
        tree = new Tree<>(new TreeNode<>(2));
        tree.addChild(null, n1);
        Assert.assertEquals(n1, tree.root().getChildren().get(0));
    }

    @Test(expected = NullPointerException.class)
    public void testGetChildWithNullParentAndChild(){
        tree = new Tree<>(new TreeNode<>(2));
        tree.addChild(null, null);
    }

    @Test
    public void out() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        TreeNode<String> rootNode = new TreeNode<>("{");
        Tree<String> t = new Tree<>(rootNode);
        t.addChild(rootNode, new TreeNode<String>("["));
        t.addChild(rootNode, new TreeNode<String>("]"));
        t.addChild(rootNode, new TreeNode<String>("}"));
        t.printTree();
        Assert.assertEquals("{\r\n  [\r\n  ]\r\n  }\r\n", outContent.toString());
        System.setOut(null);
    }
}
