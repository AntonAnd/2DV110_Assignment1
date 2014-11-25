package test;

import org.junit.Test;

import main.Main;


public class MainTest {
	private Main main;

	@Test(expected = NullPointerException.class)
	public void testConstructor(){
		main = new Main(null);
	}
}
