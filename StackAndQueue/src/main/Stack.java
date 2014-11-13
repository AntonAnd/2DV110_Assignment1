package main;

import java.util.LinkedList;

/**
 * This class is our implementation of a Stack.
 *
 * @author Johan Widen
 */
public class Stack<E> {

    private LinkedList<E> stack;

    /**
     * Constructor
     */
    public Stack() {
        stack = new LinkedList<E>();
    }

    /**
     * Add an object to the stack.
     */
    public void push(E obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else {
            stack.addFirst(obj);
        }
    }

    /**
     * Returns the object at the top of the stack without removing it.
     *
     * @return the obj at top of the stack or null when empty.
     */
    public E peek() {
        if (stack.size() == 0) {
            return null;
        }
        return stack.getFirst();
    }

    /**
     * Returns the number of objects in the stack.
     *
     * @return the number of objects.
     */
    public int size() {
        return stack.size();
    }

    /**
     * Returns and remove the first object of the stack.
     *
     * @return the first object of the stack or null when empty.
     */
    public E pop() {
        if (stack.size() == 0) {
            return null;
        }
        return stack.removeFirst();
    }
}
