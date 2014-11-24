package main;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class represents the queue ADT.
 * @author Anton
 *
 * @param <E>
 */
public class QueueClass<E> {
	
	private Queue<E> queue;
	
	/**
	 * QueueClass constructor.
	 */
	public QueueClass(){
		queue = new LinkedList<E>();
	}

	/**
	 * Enqueues an element to the queue.
	 * @param element element to be added.
	 */
	public void enqueue(E element){
		if(element == null){
			throw new IllegalArgumentException();
		}
		queue.add(element);
	}
	
	/**
	 * Returns the first element in the queue, without removing it.
	 * @return head of queue.
	 */
	public E peek(){
		return queue.peek();
	}
	
	/**
	 * Returns and removes the head of the queue, or null if 
	 * queue is empty.
	 * @return head of queue.
	 */
	public E dequeue() {
		return queue.poll();
	}

	/**
	 * Returns the size of the queue.
	 * @return size of the queue.
	 */
	public int getSize(){
		return queue.size();
	}
}
