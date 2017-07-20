package designPattern.thread.customThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	
//	public static void main(String[] args) {
//		//create queue size - 3
//    	//Number of threads - 4
//		MyThreadPool threadPool = new MyThreadPool(3,4);
//		//Created 15 Tasks and submit to pool
//		for(int taskNumber = 1; taskNumber<=7;taskNumber++){
//			MyTask myTask = new MyTask(taskNumber);
//			threadPool.submitTask(myTask);
//		}
//		
//	}
//	
	
	
	
	 public static void main(String[] args) { 
		 
	        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
	        for (int i = 0; i < 10; i++) {  
	            Runnable worker = new MyTask(i);  
	            executor.execute(worker);//calling execute method of ExecutorService  
	          }  
	        executor.shutdown();  
	        while (!executor.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");  
	    }  
}
