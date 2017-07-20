package designPattern.singleton;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CountDownLatchDemo {
	
	

	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
	
		String s = "satya , sai";
		String[] split = s.split(",");
		String first = split[0];
	     String second  = split[1];
	     char[] r = first.toCharArray();
		
		
		final CyclicBarrier cb = new CyclicBarrier(5);
		 
		   Work2 first1 = new Work2(1000, cb, "WORKER-1");
		   Work2 second1= new Work2(2000, cb, "WORKER-2");
		   Work2 third1 = new Work2(3000, cb, "WORKER-3");
		   Work2 fourth1 = new Work2(4000, cb, "WORKER-4");
		    first1.start();
			second1.start();
			third1.start();
			fourth1.start();
			
			cb.await();
			System.out.println(Thread.currentThread().getName() + " cyclic barier has finished");

		CountDownLatch countDownLatch = new CountDownLatch(4);
		Work first = new Work(1000, countDownLatch, "WORKER-5");
		Work second = new Work(2000, countDownLatch, "WORKER-6");
		Work third = new Work(3000, countDownLatch, "WORKER-7");
		Work fourth = new Work(4000, countDownLatch, "WORKER-8");
//		first.start();
//		second.start();
//		third.start();
//		fourth.start();

		try {
			countDownLatch.await();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Main thread has started
		System.out.println(Thread.currentThread().getName() + " has finished");
	}

}

class Work extends Thread {
	CountDownLatch countDownLatch;
	String name;
	int delay;

	public Work(int delay, CountDownLatch countDownLatch, String name) {
		super(name);
		this.delay = delay;
		this.countDownLatch = countDownLatch;

	}

	public void run() {
		try {
			Thread.sleep(delay);
			countDownLatch.countDown();
			System.out.println(Thread.currentThread().getName() + "Finishe");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
class Work2 extends Thread {
	CyclicBarrier cyclicBarrier;
	String name;
	int delay;

	public Work2(int delay, CyclicBarrier cyclicBarrier, String name) {
		super(name);
		this.delay = delay;
		this.cyclicBarrier = cyclicBarrier;

	}

	public void run() {
		try {
			Thread.sleep(delay);
			cyclicBarrier.await();
			System.out.println(Thread.currentThread().getName() + "Finishe");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
