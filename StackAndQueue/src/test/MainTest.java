package test;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Main;
import main.QueueClass;


public class MainTest {
	private Main main;
	private String filePath = "C:\\Users\\Anton\\Documents\\json.txt";
	private QueueClass<String> q;
	
	@Before
	public void init(){
		main = new Main(filePath);
		q = main.constructQueue(filePath);
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
}
