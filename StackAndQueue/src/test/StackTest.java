package test;

import main.Stack;

import org.junit.Test;

public class StackTest {

	@Test
	public void shouldCreateInstance() {
		new Stack();
	}

	@Test
	public void shouldPushString() {
		Stack s = new Stack();
		s.push("Test");
	}
}
