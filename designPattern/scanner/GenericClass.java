package designPattern.scanner;

public class GenericClass<T> {
	T obj;
	
	GenericClass(T obj){
		this.obj = obj;
	}

	
	public T getValue(){
		return this.obj;
	}
	
	
	public static void main(String[] args) {
		GenericClass<String> class1 = new GenericClass<String>("Satya");
		System.out.println(class1.getValue());
		
		GenericClass<Integer> intValue = new GenericClass<>(10);
		System.out.println(intValue.getValue());
		
	}
}
