package designPattern.scanner;

public class Test {
	public static void main(String[] args) {
		// t is a reference
		Test123 t = new Test123(5);

		// Reference is passed and a copy of reference
		// is created in change()
		Test123.change(t);

		// Old value of t.x is printed
		System.out.println(t.x);
		
		
		
		Integer i = new Integer(10);
	      Integer j = new Integer(20);
	      Test123.swap(i, j);
	      System.out.println("i = " + i + ", j = " + j);
		
	}

	
	
}

class Test123{
	int x;

	Test123(int i) {
		x = i;
	}

	Test123() {
		x = 0;
	}
	
	 public static void swap(Integer i, Integer j) 
	   {
	      Integer temp = i;
	      i = j;
	      j = temp;
	   }
	

	public static void change(Test123 t) {
		// We changed reference to refer some other location
		// now any changes made to reference are not reflected
		// back in main
		t = new Test123();

		t.x = 10;
	}
	
}
