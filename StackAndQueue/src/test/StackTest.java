package test;

import main.Stack;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the Stack class.
 *
 * @author Johan Widen
 */
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

    @Test(expected = IllegalArgumentException.class)
    public void pushNullShouldThrowIllegalArgumentException() {
        Stack<String> s = new Stack<String>();
        s.push(null);
    }

    @Test
    public void peekString() {
        Stack<String> s = new Stack<String>();
        s.push("Test");
        Assert.assertEquals("Test", s.peek());
    }

    @Test
    public void peekNullShouldReturnNull() {
        Stack<String> s = new Stack<String>();
        Assert.assertEquals(null, s.peek());
    }

    @Test
    public void size() {
        Stack<String> s = new Stack<String>();
        s.push("Test1");
        s.push("Test2");
        Assert.assertEquals(2, s.size());
    }
}
