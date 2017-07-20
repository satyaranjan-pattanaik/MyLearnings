package designPattern.java8;

import java.util.ArrayList;

public final class ExcellentTest {
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the arrayList
	 */
	public ArrayList<String> getArrayList() {
		return arrayList;
	}
	
	public ExcellentTest(int id, String name, ArrayList<String> arrayList) {
		this.id = id;
		this.name = name;
		this.arrayList = arrayList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExcellentTest [id=" + id + ", name=" + name + ", arrayList="
				+ arrayList + "]";
	}
	private final  int id;
	private final String name;
	private final ArrayList<String> arrayList;
	

}
