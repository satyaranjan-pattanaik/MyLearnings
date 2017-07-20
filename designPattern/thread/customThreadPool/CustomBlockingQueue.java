package designPattern.thread.customThreadPool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * @author satypatt
 *
 * @param <E>
 */
public class CustomBlockingQueue<E> {
	private Queue<E> queue;
	private Lock lock;
	private Condition isFullCondition;
	private Condition isEmptyCondition;
	int maxQueueSize;

	public CustomBlockingQueue(int maxQueueSize) {
		lock = new ReentrantLock();
		isFullCondition = lock.newCondition();
		isEmptyCondition = lock.newCondition();
		queue = new LinkedList<E>();
		this.maxQueueSize = maxQueueSize;
	}

	/**
	 * @param task
	 */
	public void enQueue(E task) {
		try {
			lock.lock();
			while (maxQueueSize == queue.size()) {
				try {
					isFullCondition.await();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			queue.offer(task);
			isEmptyCondition.signalAll();
		}
		finally {
			lock.unlock();
		}

	}

	/**
	 * De queue.
	 *
	 * @return the e
	 */
	public E deQueue() {
		E task = null;

		try {
			lock.lock();

			while (queue.size() == 0) {
				try {
					isEmptyCondition.await();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			task = queue.poll();
			isFullCondition.signalAll();
		}

		finally {
			lock.unlock();
		}
		return task;
	}
	
	
	
//	private Queue<E> queue = new LinkedList<E>();
//    private int EMPTY = 0;
//    private int MAX_TASK_IN_QUEUE = -1;
//
//    public CustomBlockingQueue(int size){
//        this.MAX_TASK_IN_QUEUE = size;
//    }
//
//    public synchronized void enQueue(E task)
//            throws InterruptedException  {
//        while(this.queue.size() == this.MAX_TASK_IN_QUEUE) {
//            wait();
//        }
//        if(this.queue.size() == EMPTY) {
//            notifyAll();
//        }
//        this.queue.offer(task);
//    }
//
//    public synchronized E deQueue()
//            throws InterruptedException{
//        while(this.queue.size() == EMPTY){
//            wait();
//        }
//        if(this.queue.size() == this.MAX_TASK_IN_QUEUE){
//            notifyAll();
//        }
//        return this.queue.poll();
//    }
//	

}
