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
	
	@Test
	public void getChildrenTest(){
		TreeNode<String> t = new TreeNode<String>();
		ArrayList<TreeNode<String>> a = t.getChildren();
		if(t.getChildren().isEmpty())
			Assert.assertTrue(true);
	}
	
	@Test
	public void getParentTest(){
		
	}
	
	@Test
	public void setParentTest(){
		
	}
	
	
}
