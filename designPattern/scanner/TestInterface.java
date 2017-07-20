package designPattern.scanner;

public interface TestInterface {
	 public void square(int a);
	 
	    // default method
	    default void show()
	    {
	      System.out.println("Default Method Executed");
	    }
}
