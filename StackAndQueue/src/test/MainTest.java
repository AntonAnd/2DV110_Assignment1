package test;



import org.junit.Assert;
import org.junit.Test;

import main.Main;
import main.QueueClass;


public class MainTest {
	private Main main;
	private String filePath = "C:\\Users\\Anton\\Documents\\json.txt";

	@Test(expected = NullPointerException.class)
	public void testConstructor(){
		main = new Main(null);
	}
	
	@Test
	public void testconstructQueue(){
		main = new Main(filePath);
		QueueClass<String> q = main.constructQueue(filePath);
		Assert.assertNotNull(q);
	}
}
