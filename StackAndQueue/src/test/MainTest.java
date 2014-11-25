package test;



import main.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import main.Main;
import main.QueueClass;
import main.Tree;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;


public class MainTest {
	
	@Mock private QueueClass<String> queue;
	private Main main;
	private String filePath = "src/jsonTextFile";
	private QueueClass<String> q;
	
	@Before
	public void init(){
		main = new Main(filePath);
		q = main.constructQueue(filePath);
		MockitoAnnotations.initMocks(this);
	}

	@Test(expected = NullPointerException.class)
	public void testConstructor(){
		main = new Main(null);
	}
	
	@Test
	public void testconstructQueue(){
		Assert.assertNotNull(q);
	}
	
	@Test
	public void testQueueIsNotEmpty(){
		Assert.assertTrue(q.getSize()>0);
	}
	
	
	@Test
	public void testConstructTree(){
		Tree<String> tree = main.constructTree(queue);
		verify(queue).getSize();
	}
	
	@Test
	public void testGetTreeNotNull(){
		Tree<String> tree = main.constructTree(q);
		Assert.assertTrue(tree.size()>1);
	}

	@Test
	public void testPrintTree() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		main = new Main("src/jsonTextFileShort");
		q = main.constructQueue("src/jsonTextFileShort");
		Tree<String> tree = main.constructTree(q);
		main.printTree(tree);
		Assert.assertEquals("root\r\n  {\r\n    \"menu\"\r\n    :\r\n    \"test\"\r\n", outContent.toString());
		System.setOut(null);
	}
}
