package designPattern.thread;

import java.util.HashMap;

class MyThread extends Thread {

	public MyThread() {

	}

	public MyThread(Runnable r) {
		super(r);
	}

	@Override
	public void run() {
		System.out.println("MyThread");
	}
}

interface Disp {
	void run();
}

class X implements Disp{

	private Disp target;

	X() {

	}

	X(Disp val) {
		this.target = val;
	}

	public void start() {
		if (target != null) {
			target.run();
		}
		else {
			run();
		}
	}

	public void run() {
		System.out.println("Parent");
	}
}

class Y extends X {
	
	Y()
	{
		
	}
	
	Y(Disp target) {
		super(target);
	}

	public void run() {
		System.out.println("Child");
	}
}

public class ThredsClass {

	public static void main(String[] args) {
		
		System.out.println(1 << 4);
		System.out.println(1 << 30);
		
		
//		MyThread mt1 = new MyThread();
//		// mt1.start();
//
//		MyThread mt2 = new MyThread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("MyRunnable");
//			}
//		});
//		mt1.start();
//		mt2.start();
//	}
//	
//	public static void main(String[] args) {
//		Y x = new Y();
//		
//		
//		Y y1 = new Y(new Disp() {
//			
//			@Override
//			public void run() {
//				System.out.println("Interface");
//				
//			}
//		});
//		
//		x.start();
//		y1.start();
	}
}
