package test;



import org.junit.Assert;
import org.junit.Test;

import main.Main;
import static org.mockito.Mockito.*;

public class MainTest {
	private Main main;

	@Test(expected = NullPointerException.class)
	public void testConstructor(){
		main = new Main(null);
	}
}
