package designPattern.thread.customThreadPool;

/**
 * The Class MyThreadPool.
 */
public class MyThreadPool {

	
	/** The blocking queue. */
	CustomBlockingQueue<Runnable> blockingQueue;
	
	/**
	 * Instantiates a new my thread pool.
	 *
	 * @param maxSize the max size
	 * @param taskSize the task size
	 */
	public MyThreadPool(int maxQueueSize, int maxThreadCount) {
		String threadName;
		blockingQueue = new CustomBlockingQueue<>(maxQueueSize);
		for (int count = 1; count <= maxThreadCount; count++) {
			threadName = "Thread - " + count;
            Runnable taskExecutor = new TaskExecutor(blockingQueue);
            Thread thread = new Thread(taskExecutor,threadName);
            System.out.println("Initialising Thread "+ threadName);
            thread.start();
		}
	}
	
	/**
	 * Submit task.
	 *
	 * @param task the task
	 */
	public void submitTask(Runnable task){
		//try {
			blockingQueue.enQueue(task);
//		}
//		catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
