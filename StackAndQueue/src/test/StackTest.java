package test;

import main.Stack;

import org.junit.Test;

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
}
