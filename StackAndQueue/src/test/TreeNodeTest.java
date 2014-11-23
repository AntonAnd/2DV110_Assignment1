package test;

import java.util.ArrayList;

import main.TreeNode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeNodeTest<E> {
	private TreeNode<String> t;
	private TreeNode<String> nodeWithData;
	private TreeNode<String> curlyBracketNode;

	@Before
	public void init(){
		 t = new TreeNode<String>();
		 nodeWithData = new TreeNode<String>("test");
		 curlyBracketNode = new TreeNode<String>("{");
	}
	
	@Test 
	public void testConstructor(){
		ArrayList<TreeNode<String>> a = t.getChildren();
		
		Assert.assertNotNull(a);
	}
	
	@Test
	public void getChildrenTest(){
		if(t.getChildren().isEmpty())
			Assert.assertTrue(true);
	}
	
	@Test
	public void getParentTest(){
		TreeNode<String> s = new TreeNode<String>();
		t.setParent(s);
		Assert.assertEquals(s, t.getParent());
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void setParentNullShouldThrowIllegalArgumentException() {
		t.setParent(null);
	}
	
	@Test
	public void getDataTest(){
		Assert.assertEquals("test", nodeWithData.getData());
	}
	
	
	@Test
	public void isJsonObjectTest(){
		Assert.assertTrue(curlyBracketNode.isJsonObject());
	}
	
}
