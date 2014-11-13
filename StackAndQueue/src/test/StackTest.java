package test;

import main.Stack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Stack class.
 *
 * @author Johan Widen
 */
public class StackTest {
    private String s1 = "Test1";
    private Stack<String> s;

    @Before
    public void setup() {
        s = new Stack<String>();
    }

    @Test(expected = IllegalArgumentException.class)
    public void pushNullShouldThrowIllegalArgumentException() {
       s.push(null);
    }

    @Test
    public void peekString() {
        s.push(s1);
        Assert.assertEquals(s1, s.peek());
    }

    @Test
    public void peekEmptyStackShouldReturnNull() {
        Assert.assertEquals(null, s.peek());
    }

    @Test
    public void size() {
        s.push(s1);
        s.push("Test2");
        Assert.assertEquals(2, s.size());
    }

    @Test
    public void popString() {
        s.push(s1);
        Assert.assertEquals(s1, s.pop());
        Assert.assertEquals(0, s.size());
    }

    @Test
    public void popEmptyStackShouldReturnNull() {
        Assert.assertEquals(null, s.pop());
        Assert.assertEquals(0, s.size());
    }
}
