package designPattern.singleton;

import java.io.IOException;

import org.aspectj.apache.bcel.classfile.ClassFormatException;

public class Temp {

	 // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    Temp()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    Temp(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    Temp(int x, int y)
    {
        System.out.println(x * y);
    }

    public static void main(String args[]) throws IOException
    {
        // invokes default constructor first
       // new Temp();
    	
		
    	try {
    		
//    		System.out.println(xxy.x);
//    		xxy.display();
    		 float p = 1f;
    	        System.out.println(p/0);
    	        Base d =new Derived();
    			d.display();
    		
    	       throw new Derived();
    	    }
    	    
    	    catch(Derived d) {
    	    	System.out.println("Derived Class Exception");
    	    }
    	    catch(Base b) {
    	    	System.out.println("Base Class Exception");
    	    }
    	
    }
	
	
}

interface xxy{
	int x=10;
	
	public static  void display()
    {
        System.out.println("hello");
    }
}

class Base extends Exception {
	protected void display() throws IOException{
		System.out.println("vase calss ");
	}
	
}
class Derived extends Base  {
	
	public void display1() throws ClassFormatException {
		System.out.println("derived calss ");
	}
}
