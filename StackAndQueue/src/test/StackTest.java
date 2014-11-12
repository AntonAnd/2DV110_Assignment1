package test;

import main.Stack;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

	@Test
	public void shouldCreateInstance() {
		new Stack();
	}

	@Test
	public void shouldPushStringWithOutError() {
		Stack<String> s = new Stack<String>();
		s.push("Test");
	}

	@Test
	public void pushShouldThrowIllegalArgumentException() {
		Stack<String> s = new Stack<String>();
		try {
			s.push(null);
			fail("Should throw IllegalArgumentException");

		} catch (IllegalArgumentException e) {

		}

	}
}
