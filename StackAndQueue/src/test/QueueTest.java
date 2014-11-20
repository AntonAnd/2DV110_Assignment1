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
	
	@Test
	public void testEnqueueInteger(){
		QueueClass<Integer> q = new QueueClass<Integer>();
		int input = 14;
		q.enqueue(input);
		int expected = q.peek();
		
		Assert.assertEquals(expected, input);
	}
	
	@Test
	public void testDequeue(){
		QueueClass<Integer> q = new QueueClass<Integer>();
		int input = 12;
		q.enqueue(input);
		int expected = q.dequeue();
		Assert.assertEquals(expected, input);
		
	}
	
	@Test
	public int testSize(){
		return 0;
	}

}
