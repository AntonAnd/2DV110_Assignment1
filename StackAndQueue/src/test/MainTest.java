package test;



import org.junit.Assert;
import org.junit.Test;

import main.Main;
import main.QueueClass;


public class MainTest {
	private Main main;

	@Test(expected = NullPointerException.class)
	public void testConstructor(){
		main = new Main(null);
	}
	
	@Test
	public void testconstructQueue(){
		main = new Main("C:\\Users\\Anton\\Documents\\json.txt");
		QueueClass<String> q = main.constructQueue("C:\\Users\\Anton\\Documents\\json.txt");
		Assert.assertNotNull(q);
	}
}
