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
		queue.add(element);
	}
	
	/*Returns the first element in the queue*/
	public E peek(){
		return queue.peek();
	}
}
