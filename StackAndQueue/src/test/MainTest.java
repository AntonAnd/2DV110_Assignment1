package test;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import main.Main;
import main.QueueClass;
import main.Tree;
import static org.mockito.Mockito.*;


public class MainTest {
	
	@Mock private QueueClass<String> queue;
	private Main main;
	private String filePath = "C:\\Users\\Anton\\Documents\\json.txt";
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
}
