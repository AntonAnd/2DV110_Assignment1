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
	private TreeNode<String> primitiveData;

	@Before
	public void init(){
		 nodeWithData = new TreeNode<String>("test");
		 curlyBracketNode = new TreeNode<String>("{");
		 arrayNode = new TreeNode<String>("[");
		 primitiveData = new TreeNode<String>("data");
	}
	
	@Test
	public void testConstructorNotNull(){
		TreeNode<String> constructor = new TreeNode<String>("a");
		Assert.assertNotNull(constructor);
	}
	
	@Test(expected = NullPointerException.class)
	public void testConstructor(){
		TreeNode<String> nullConstructor = new TreeNode<String>(null);
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
	public void isJsonArrayTest(){
		Assert.assertTrue(arrayNode.isJsonArray());
	}
	
	@Test
	public void isJsonPrimitiveTest(){
		Assert.assertTrue(primitiveData.isJsonPrimitive());
	}
	
}
