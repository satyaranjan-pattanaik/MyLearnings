package designPattern.scanner;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

interface First{
//	default int getValue(int x){
//		return x*x;
//	}
	 //int getValue(int x);
	 int operation(int a, int b);
}

public class InterfaceTestDemo {
	
	private static char charAt;

	{
		System.out.println("satya block");
	}
	
	static {
		System.out.println("satya static block");
	}
	
	
	InterfaceTestDemo(){
		System.out.println("satya construction block");
	}
	
	public static void main(String[] args) {
		Semaphore s = new Semaphore(5);
	  Lock l = new ReentrantLock();
		int i,j,k;
		int n=5;
		 for(i=0; i<=n; i++)
	        {
	           for(k=0;k<n-i;k++){
	        	   System.out.print(" ");
	        	   }
	           for(j=0;j<i;j++){
	        	   System.out.print("*");
	           }
	           System.out.println();
	           }
		
		
		
//		
//		String strPwd = "password";
//        char[] charPwd = new char[] {'p','a','s','s','w','o','r','d'};
//         
//        System.out.println("String password: " + strPwd );
//        System.out.println("Character password: " + charPwd.toString());
//		
//		String number = "ABCDEFGH";
//		Random ran = new Random();
//		char[] otp = new char[5];
//		for (int i =0; i<=4;i++) {
//			otp[i] = number.charAt(ran.nextInt(number.length()));
//		}
//		
//		
//		System.out.println(otp);
//		
//		  int x = 5, y = 10;
//		  System.out.println(x +": "+y);
//	      int temp = x ^ y;
//		  y=temp^y;
//		  x=temp^y;
//		  System.out.println();
//		  System.out.println(x +": "+y);
		//InterfaceTestDemo demo = new InterfaceTestDemo();
		//demo.getValue(10);
//		First first = (x)-> x*x;
//		System.out.println(first.getValue(10));
//		First f = (x,y)->x*y;
//		First f2 = (x,y)->x+y;
		// the line below this gives an output
        // \u000d System.out.println("comment executed");
		
	//	InterfaceTestDemo demo2 = new InterfaceTestDemo();
		
//		Satya:
//			for(int i =0;i<10;i++){
//				for(int j=0;j<=i;j++){
//					if(j==4){
//						System.out.println(" break from value of j = " + j);
//						break Satya;
//						}
//					System.out.println(" value of j = " + j);
//				}
//			}
		
		
	}

}
