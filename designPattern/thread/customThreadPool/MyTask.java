package designPattern.thread.customThreadPool;

/**
 * The Class MyTask.
 */
public class MyTask extends Thread {
	
	/** The task number. */
	private int taskNumber;

	/**
	 * Instantiates a new my task.
	 *
	 * @param taskNumber the task number
	 */
	MyTask(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {

		System.out.println("Start executing of task number :" + taskNumber);
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End executing of task number :" + taskNumber);

	}

}
