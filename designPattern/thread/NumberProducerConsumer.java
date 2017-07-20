package designPattern.thread;

import java.util.Stack;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NumberProducerConsumer extends Thread {
	private Lock lock;
	private Condition condition;
	private static boolean produce = true;
	String type;
	static  Stack<Integer> stack = new Stack<>();

	NumberProducerConsumer(Lock lock, Condition condition, String type) {
		this.lock = lock;
		this.condition = condition;
		this.type = type;
	}
	
	
	
	
	
//	
//	
//	
//    public void run() {
//        int i = type.equals("Producer") ? 1 : 2;
//        while (i <= 10) {
//            if (type.equals("Producer"))
//                printOdd(i);
//            if (type.equals("Consumer"))
//                printEven();
//            i = i + 1;
//        }
//    }
//
//    private void printOdd(int i) {
//        // synchronized (lock) {
//        lock.lock();
//        while (!produce) {
//            try {
//                // lock.wait();
//                condition.await();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        if(stack.isEmpty()){
//        System.out.println(type + " " + i);
//        stack.push(i);
//        produce = false;
//        }
//        // lock.notifyAll();
//        condition.signalAll();
//        lock.unlock();
//    }
//
//    // }
//
//    private void printEven() {
//        // synchronized (lock) {
//        lock.lock();
//        while (produce) {
//            try {
//                // lock.wait();
//                condition.await();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        if(!stack.isEmpty()){
//            System.out.println(type + " " +  stack.pop());
//            produce = true;
//        }
//        // lock.notifyAll();
//        condition.signalAll();
//        lock.unlock();
//    }
//	
//	
	
	
	

	public void run() {
			if (type.equals("Producer")) {
				for (int i = 1; i <= 10; i++) {
					produceNumber(i);
				}
			}
			if (type.equals("Consumer")) {
					while(true)
				       consumeNumber();
			}

	}

	public void produceNumber(int i) {
		try {
			lock.lock();
			while (!produce) {
				try {
					condition.await();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (stack.isEmpty()) {
				System.out.println("Push the numeber to consume" +i);
				stack.push(i);
				produce = false;
			}
			condition.signalAll();
		}
		finally {
			lock.unlock();
		}

	}

	public void consumeNumber() {
		try {
			lock.lock();
			while (produce) {
				try {
					condition.await();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (!stack.isEmpty()) {
				Integer pop = stack.pop();
				produce = true;
				System.out.println("The number consumed ..." + pop.intValue());
				

			}
			condition.signalAll();
		}
		finally {
			lock.unlock();
		}

	}

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();

		NumberProducerConsumer numberProducerConsumer = new NumberProducerConsumer(
				lock, condition, "Producer");
		NumberProducerConsumer numberProducerConsumer1 = new NumberProducerConsumer(
				lock, condition, "Consumer");
		numberProducerConsumer.start();
		numberProducerConsumer1.start();

	}

}
