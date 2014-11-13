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
    private String s1 = "Test1";

    @Test
    public void shouldCreateInstance() {
        new Stack();
    }

    @Test
    public void shouldPushStringWithoutError() {
        Stack<String> s = new Stack<String>();
        s.push(s1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void pushNullShouldThrowIllegalArgumentException() {
        Stack<String> s = new Stack<String>();
        s.push(null);
    }

    @Test
    public void peekString() {
        Stack<String> s = new Stack<String>();
        s.push(s1);
        Assert.assertEquals(s1, s.peek());
    }

    @Test
    public void peekNullShouldReturnNull() {
        Stack<String> s = new Stack<String>();
        Assert.assertEquals(null, s.peek());
    }

    @Test
    public void size() {
        Stack<String> s = new Stack<String>();
        s.push(s1);
        s.push("Test2");
        Assert.assertEquals(2, s.size());
    }

    @Test
    public void popString() {
        Stack<String> s = new Stack<String>();
        s.push(s1);
        Assert.assertEquals(s1, s.pop());
        Assert.assertEquals(0, s.size());
    }
}
