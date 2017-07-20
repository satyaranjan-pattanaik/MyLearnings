package designPattern.thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadDemoClass1 {
	 int main(){
		return 1;
	}
} 

public class ThreadDemoClass extends ThreadDemoClass1{
	
	public int main(){
		return 1;
	}
	
	
	

	public static void main(String[] args) {
		
		HashMap<String,Integer> ff = new HashMap<>();

		String key2 = ff.entrySet().stream().max((e1,e2)->e1.getValue()-e2.getValue()).get().getKey();
		
		
				ff.entrySet().stream().max((entryset1,entryset2)->entryset1.getValue()-entryset2.getValue()).get().getKey();
		String key = Collections.max(ff.entrySet(),(entryset1,entryset2)->entryset1.getValue()-entryset2.getValue()).getKey();

		
		ThreadDemoClass t1= new ThreadDemoClass();
		Class<? extends ThreadDemoClass> class1 = t1.getClass();
		ThreadDemoClass t2= new ThreadDemoClass();
		Class<? extends ThreadDemoClass> class2 = t2.getClass();
		System.out.println(class1==class2);
		
		Lock lock = new ReentrantLock(true);
		
		
		
		String s = 3 + 2 + "hello" + 6 + 4;
        System.out.print(s);
		
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {

				System.out.println("I am Thread 1");
				
			}
		};
		
		new Thread(runnable).start();
		
		
		Object ob1 = new Object();
		Object ob2 = new Object();
		
		
		Runnable runnable1 = ()->{
			synchronized (ob1) {
				System.out.println("Thread 1 object 1 lock");
				
				try {
					TimeUnit.SECONDS.sleep(2);;
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (ob2) {
					System.out.println("Thread 1 object 2 lock");
				}
			}
		};
		new Thread(runnable1).start();
		
		Runnable runnable2 = ()->{
			synchronized (ob2) {
				System.out.println("Thread 2 object 2 lock");
				
				try {
					TimeUnit.SECONDS.sleep(2);;
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (ob1) {
					System.out.println("Thread 2 object 1 lock");
				}
			}
		};
		
		new Thread(runnable2).start();
		
	}

}
