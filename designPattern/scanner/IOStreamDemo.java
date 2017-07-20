package designPattern.scanner;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.ListIterator;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Vector;

public class IOStreamDemo {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Integer> alArrayList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			alArrayList.add(i);
		}
		System.out.println(alArrayList);
		
		 NavigableMap<String, Integer> nm =
                 new TreeMap<String, Integer>();
		 
		 
		
		int d = 128;
		System.out.printf("%32s%n",Integer.toBinaryString(d));
		System.out.printf("%32s%n",Integer.toBinaryString(d>>16));
		System.out.printf("%32s%n",Integer.toBinaryString(d>>>16));
		
		
		  int a = 10;
		  System.out.println(~a);
		  
		  int s =56;
		  System.out.println(s >> 2);
		  System.out.println(s >> 16);
		
		ListIterator<Integer> iterator = alArrayList.listIterator();
		
		while (iterator.hasNext()){
			//System.out.println(iterator.previous());
		//  moving cursor to next element
            int i = (Integer)iterator.next();
 
            // getting even elements one by one
            System.out.print(i + " ");
 
            // Changing even numbers to odd and
            // adding modified number again in 
            // iterator
            if (i%2==0)
            {
                i++;  // Change to odd
              // iterator.set(i);  // set method to change value
                iterator.add(i);  // to add
            }
        }
        System.out.println();
        System.out.println(alArrayList);
			
		
		
//
//		Vector v = new Vector();
//		for (int i = 0; i < 10; i++)
//			v.addElement(i);
//		System.out.println(v);
//
//		Enumeration enumeration = v.elements();
//
//		while (enumeration.hasMoreElements()) {
//			System.out.println(enumeration.nextElement());
//		}
//
//		PrintStream printStream1 = new PrintStream(System.out);
//		System.setOut(printStream1);
//		System.out.println("Print in console");
//
//		System.out.println("HEllo");
//		PrintStream printStream = new PrintStream(new File(
//				"/Users/satypatt/Desktop/Satya/Projects/Cme/Codebase/modularcme/cme/cme-controller/src/main/resources/filename.txt"));
//		System.setOut(printStream);
//		System.out.println("Print in File");
//
	}

}
