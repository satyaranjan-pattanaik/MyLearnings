package designPattern.thread;

import java.util.NoSuchElementException;

/**
 * The Class ArrayQueue.
 *
 * @author satypatt
 */
public class ArrayQueue {

	/** The queue. */
	public int queue[];

	/** The rear. */
	int front, rear = -1;

	/** The size. */
	int length, size = 0;

	/**
	 * Instantiates a new array queue.
	 *
	 * @param size
	 *            the size
	 */
	ArrayQueue(int size) {
		this.size = size;
		queue = new int[size];
	}

	public void insert(int value) {

		if (rear == -1) {
			rear = 0;
			front = 0;
			queue[rear] = value;
		}
		else if (rear >= size) {
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		else if (rear < size) {
			queue[++rear] = value;
		}
		length++;

	}
	
	
	/*  Function to check the front element of the queue */
    public int peek() 
    {
    	if(front==-1){
    		throw new NoSuchElementException("Underflow Exception");
    	}
    	
    	return queue[front];
    			
    }

}
