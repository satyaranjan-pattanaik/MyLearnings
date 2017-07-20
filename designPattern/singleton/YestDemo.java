package designPattern.singleton;

import designPattern.scanner.TestInterface;
import designPattern.thread.ThreadDemoClass;




//A simple Java program to demonstrate multiple
//inheritance through default methods.
interface TestInterface1
{
 // default method
 default void show()
 {
     System.out.println("Default TestInterface1");
 }
 
 public static void show2()
 {
    System.out.println("Default TestInterface2");
 }
}

interface TestInterface2
{
 // Default method
 default void show()
 {
     System.out.println("Default TestInterface2");
 }
 
//Default method
public static  void show2()
{
   System.out.println("Default TestInterface2");
}
}


public class YestDemo implements TestInterface1,TestInterface2
{
	
	// Overloaded methods
//    public void fun(Integer i)
//    {
//        System.out.println("fun(Integer ) ");
//    }
    public void fun(String name)
    {
        System.out.println("fun(String ) ");
    }
	
    public void fun(Object name)
    {
        System.out.println("fun(String ) ");
    }
	
	
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }
 

//@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		TestInterface1.super.show();
//	}
//    @Override
//	public void show() {
//		// TODO Auto-generated method stub
//		//TestInterface1.super.show();
//	}

	@Override
	public void show() {
		TestInterface2.super.show();
	}

	public static void main(String args[])
    {
		
		YestDemo yestDemo = new YestDemo();
		yestDemo.show();
		
		yestDemo.fun(null);
    }
}