package test;

import main.Stack;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

	@Test
	public void shouldCreateInstance() {
		new Stack();
	}

	@Test
	public void shouldPushStringWithoutError() {
		Stack<String> s = new Stack<String>();
		s.push("Test");
	}

	@Test
	public void pushNullShouldThrowIllegalArgumentException() {
		Stack<String> s = new Stack<String>();
		try {
			s.push(null);
			fail("Should throw IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
	}

	@Test
	public void peekString() {
		Stack<String> s = new Stack<String>();
		s.push("Test");
		Assert.assertEquals("Test", s.peek());
	}
}
