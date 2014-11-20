package main;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass<E> {
	
	private Queue<E> queue;
	
	public QueueClass(){
		queue = new LinkedList<E>();
	}
	
	/*Enqueue an element*/
	public void enqueue(E element){
		if(element == null){
			throw new IllegalArgumentException();
		}
		queue.add(element);
	}
	
	/*Returns the first element in the queue*/
	public E peek(){
		return queue.peek();
	}
	
	/*Returns and removes the head of the queue, or null if
	 * queue is empty.
	 */
	public E dequeue() {
		return queue.poll();
	}
	
	public int getSize(){
		return queue.size();
	}
}
