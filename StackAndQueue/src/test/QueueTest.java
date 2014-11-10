package test;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest<E> {

	@Test
	public void shouldReturnAddedElement(E element) {
		List<E> queue = new LinkedList<>();
		queue.add(element);
		
		E expected = queue.get(0);
		Assert.assertEquals(expected, element);
	}

}
