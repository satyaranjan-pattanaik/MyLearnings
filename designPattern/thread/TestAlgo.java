package designPattern.thread;

public class TestAlgo {

	
//	public class BlockingQueue<E> {
//		// implement code here ...
//		/**
//		 * @param queue
//		 *            The underlying "wrapped" queue.
//		 */
//
//		private Queue<E> queue;
//		private int maxSize;
//		ReentrantLock lock;
//		Condition isFullCondition;
//		Condition isEmptyCondition;
//		public BlockingQueue(Queue<E> queue) {
//			this.queue = queue;
//			this.maxSize = 8;
//			lock = new ReentrantLock();
//		    isFullCondition = lock.newCondition();
//		    isEmptyCondition = lock.newCondition();
//		}
//
//		/**
//		 * Inserts the specified element into the underlying queue, waiting if
//		 * necessary for the underlying queue to be ready to accept new elements.
//		 * 
//		 * @param e
//		 *            the element to insert.
//		 * @throws InterruptedException
//		 */
//		public void push(E e) {
//
//			if (queue.size() == maxSize) {
//				try {
//					this.wait();
//				}
//				catch (InterruptedException e1) {
//					e1.printStackTrace();
//				}
//			}
//			queue.add(e);
//			//queue.offer(e);
//			this.notifyAll();
//		}
//		
//		
//		public void push1(E e) {
//			lock.lock();
//		    try {
//		       while (queue.size() == maxSize) {
//		            try {
//		                isFullCondition.await();
//		            } catch (InterruptedException ex) {}
//		        }
//		        queue.add(e);
//		       // queue.offer(e);
//		        isEmptyCondition.signalAll();
//		    } finally {
//		        lock.unlock();
//		    }
//		}
//
//		/**
//		 * Retrieves and removes the head of the underlying queue, waiting if
//		 * necessary until it is capable of providing an element.
//		 * 
//		 * @return the retrieved element
//		 */
//		public E pull() {
//			if (queue.size() == 0) {
//				try {
//					this.wait();
//				}
//				catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			this.notifyAll();
//			//return queue.poll();
//			return queue.remove();
//		}
//		
//		public E pull1() {
//			E t = null;
//		    lock.lock();
//		    try {
//		        while (queue.size() == 0) {
//		            try {
//		                isEmptyCondition.await();
//		            } catch (InterruptedException ex) {}
//		        }
//		        t = queue.poll();
//		       //t= queue.remove();
//		        isFullCondition.signalAll();
//		    } finally { 
//		        lock.unlock();
//		    }
//		    return t;
//		}
//		
//		public static void main(String[] args) {
//			BlockingQueue<Integer> b=new BlockingQueue<Integer>(new LinkedList<>());
//	        System.out.println("put(11)");
//	        b.push1(11);
//	        System.out.println("put(12)");
//	        b.push1(12);
//	        System.out.println("take() > "+b.pull1());
//	        System.out.println("take() > "+b.pull1());
//		}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int i,j,temp;
		int ar[] = {1,56,34,7,9,51};
		for (int k : ar) {
			System.out.print(k+":");
		}
		
//		//Bubble Sort
//		
//		for (i=0;i<ar.length-1;i++) {
//			
//			for(j=0;j<ar.length-i-1;j++)
//			{
//				if(ar[j]>ar[j+1]){
//					temp = ar[j];
//					ar[j] = ar[j+1];
//					ar[j+1] =temp;
//				}
//			}
//			
//		}
//		System.out.println();
//		for (int k : ar) {
//			System.out.print(k +":");
//		}
//		
//		
		//Selection Sort
		
		int pos;
		for (i=0;i<ar.length-1;i++) {
			pos=i;
			
			for(j=i+1;j<ar.length;j++){
				if(ar[j] < ar[pos]){
					pos=j;
				}
			}
			//swap ar[i] and 
			temp = ar[i];
			ar[i] = ar[pos];
			ar[pos] =temp;
			
		}
		
		System.out.println();
		for (int k : ar) {
			System.out.print(k +":");
		}
		
		
	}
}
