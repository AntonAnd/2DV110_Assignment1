package main;

import java.util.LinkedList;

/**
 * This class is our implementation of a Stack.
 * 
 * @author Johan Widen
 * 
 */
public class Stack<E> {

    private LinkedList<E> stack;

    public Stack() {
        stack = new LinkedList<E>();
    }

    public void push(E element) {
        stack.addFirst(element);
    }


}
