package test;

import java.util.ArrayList;

import main.TreeNode;

import org.junit.Assert;
import org.junit.Test;

public class TreeNodeTest<E> {

	
	@Test 
	public void testConstructor(){
		TreeNode<String> t = new TreeNode<String>();
		ArrayList<TreeNode<String>> a = t.getChildren();
		
		Assert.assertNotNull(a);
	}
	
	/*@Test
	public void getChildrenTest(){
		TreeNode<String> t = new TreeNode<String>();
		ArrayList<TreeNode<String>> a = t.getChildren();
		Assert.assertEquals(null, a);
	}*/
	
}
