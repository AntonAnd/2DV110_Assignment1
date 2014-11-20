package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.QueueClass;

public class QueueTest<E> {
	private QueueClass<Integer> queueInt;
	private QueueClass<String> queueString;
	
	@Before
	public void init(){
		queueInt = new QueueClass<Integer>();
		queueString = new QueueClass<String>();
		
	}
	
	@Test
	public void testPeek(){
		queueInt.enqueue(12);
		int result = queueInt.peek();
		Assert.assertEquals(12, result);
	}
	
	@Test(expected = IllegalArgumentException.class)
    public void enqueueNullShouldThrowIllegalArgumentException() {
       queueInt.enqueue(null);
    }

	@Test
	public void testEnqueueString(){
		String input = "test";
		queueString.enqueue(input);
		String expected = queueString.peek();
		
		Assert.assertEquals(expected, input);
	}
	
	
	@Test
	public void testEnqueueInteger(){
		int input = 14;
		queueInt.enqueue(input);
		int expected = queueInt.peek();
		
		Assert.assertEquals(expected, input);
	}
	
	@Test
	public void testDequeue(){
		int input = 12;
		queueInt.enqueue(input);
		int expected = queueInt.dequeue();
		Assert.assertEquals(expected, input);
		
	}
	
	@Test
	public void testSize(){
		int input = 12;
		queueInt.enqueue(input);
		queueInt.enqueue(41);
		Assert.assertEquals(2, queueInt.getSize());
	}

}
