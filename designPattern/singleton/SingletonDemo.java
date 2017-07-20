package designPattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#eager-initialization
public class SingletonDemo {

	// Egger initialization
//	private static SingletonDemo singletonDemo = new SingletonDemo();

	// static block initialization for exception handling
//	static {
//		System.out.println("Initiallized parent class");
//		try {
//			if (singletonDemo == null) {
//				singletonDemo = new SingletonDemo();
//				System.out.println("initialization through Static Block");
//			}
//			else {
//				System.out.println(
//						"initialization through Static Egger initialization");
//			}
//		}
//		catch (Exception e) {
//			throw new RuntimeException(
//					"Exception occured in creating singleton instance");
//		}
//	}
	
	//Lazy initialization
//	private static SingletonDemo singletonDemo = null;
	

	private SingletonDemo() {

	}

	
	// Lazy initialization
//	public static SingletonDemo getSingletonDemoInstance() {
//		if (singletonDemo == null) {
//			singletonDemo = new SingletonDemo();
//			System.out.println("initialization through Lazy initialization");
//		}
//
//		return singletonDemo;
//	}
//	
	//ThreadSafeSingleton in Lazy initialization
//	public static synchronized SingletonDemo getSingletonDemoInstance() {
//		if (singletonDemo == null) {
//			singletonDemo = new SingletonDemo();
//			System.out.println("initialization through Lazy ThreadSafeSingleton initialization");
//		}
//
//		return singletonDemo;
//	}
//	
	
	
	//ThreadSafeSingleton in double check Lazy initialization
//	public static synchronized SingletonDemo getSingletonDemoInstance() {
//		if (singletonDemo == null) {
//			synchronized (SingletonDemo.class) {
//				if (singletonDemo == null) {
//					singletonDemo = new SingletonDemo();
//					System.out.println(
//							"initialization through Lazy ThreadSafeSingleton initialization");
//				}
//			}
//		}
//		return singletonDemo;
//	}
//	
	
	
	
	//Bill Pugh Singleton Implementation
	private static class SingletonDemoHelper{
		
		static {
			System.out.println("Initiallized inner class");
		}
		private static SingletonDemo NEWINSTANCE = new SingletonDemo();
	}
	
	
	//Bill Pugh Singleton Implementation
	public static SingletonDemo getSingletonDemoInstance() {
			System.out.println("Initiallized during asking for Instance ");
	        return SingletonDemoHelper.NEWINSTANCE;
}
	

	

}
