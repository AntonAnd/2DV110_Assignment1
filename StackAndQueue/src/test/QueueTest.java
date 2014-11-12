package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.QueueClass;

public class QueueTest<E> {

	@Test
	public void testEnqueueString(){
		QueueClass<String> q = new QueueClass<String>();
		String input = "test";
		q.enqueue(input);
		String expected = q.peek();
		
		Assert.assertEquals(expected, input);
	}

}
