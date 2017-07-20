package designPattern.java8;

import java.util.ArrayList;


public class TestDemo {

	public static void main(String[] args) {
		ArrayList<String> listString = new ArrayList<>();
		listString.add("rabi");
		listString.add("Satya");
		ExcellentTest excellentTest = new ExcellentTest(10, "Cisco", listString);
		System.out.println(excellentTest);
		ArrayList<String> arrayList = excellentTest.getArrayList();
		arrayList.add("satya123");
		System.out.println(excellentTest);
	}
}
