package designPattern.thread.customThreadPool;

/**
 * The Class TaskExecutor.
 *
 * @param <E>
 *            the element type
 */
public class TaskExecutor implements Runnable {

	/** The thread name. */
	String threadName;

	/** The blocking queue. */
	CustomBlockingQueue<Runnable> blockingQueue;

	/**
	 * Instantiates a new task executor.
	 *
	 * @param threadName
	 *            the thread name
	 * @param blockingQueue
	 *            the blocking queue
	 */
	public TaskExecutor(
			CustomBlockingQueue<Runnable> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	/*
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
//		while (true) {
//			String tName = Thread.currentThread().getName();
//			Runnable task = null;
//			try {
//				task = blockingQueue.deQueue();
//			}
//			catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("Task Started by Thread :" + tName);
//			task.run();
//			System.out.println("Task Finished by Thread :" + tName);
//		}
		
		
		
	//	try {
            while (true) {
                String name = Thread.currentThread().getName();
                Runnable task = blockingQueue.deQueue();
                System.out.println("Task Started by Thread :" + name);
                task.run();
                System.out.println("Task Finished by Thread :" + name);
            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
	}

}
