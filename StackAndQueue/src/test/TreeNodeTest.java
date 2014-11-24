package test;

import java.util.ArrayList;

import main.TreeNode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeNodeTest<E> {
	private TreeNode<String> nodeWithData;
	private TreeNode<String> curlyBracketNode;
	private TreeNode<String> arrayNode;

	@Before
	public void init(){
		 nodeWithData = new TreeNode<String>("test");
		 curlyBracketNode = new TreeNode<String>("{");
		 arrayNode = new TreeNode<String>("[");
	}
	
	@Test 
	public void testConstructor(){
		ArrayList<TreeNode<String>> a = nodeWithData.getChildren();
		
		Assert.assertNotNull(a);
	}
	
	@Test
	public void getChildrenTest(){
		if(nodeWithData.getChildren().isEmpty())
			Assert.assertTrue(true);
	}
	
	@Test
	public void getParentTest(){
		TreeNode<String> s = new TreeNode<String>("test2");
		nodeWithData.setParent(s);
		Assert.assertEquals(s, nodeWithData.getParent());
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void setParentNullShouldThrowIllegalArgumentException() {
		nodeWithData.setParent(null);
	}
	
	@Test
	public void getDataTest(){
		Assert.assertEquals("test", nodeWithData.getData());
	}
	
	
	@Test
	public void isJsonObjectTest(){
		Assert.assertTrue(curlyBracketNode.isJsonObject());
	}
	
	@Test
	public void isJsonArray(){
		Assert.assertTrue(arrayNode.isJsonArray());
	}
	
}
