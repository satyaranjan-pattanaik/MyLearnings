package designPattern.scanner;

import java.util.function.Function;
import java.util.function.Predicate;

public class JavaInbuiltDemo {

	public static void main(String[] args) {
		Predicate<String> pre = (s) -> s.startsWith("");

		Test24 t = (s) -> s.equals("satya");
		System.out.println(t.get("satya"));
		Function<Person, Job> functionmain  = new Function<Person, Job>() {
			@Override
			public Job apply(Person t) {
				return new Job(t.getPersonId(),t.getJobDescription());
			}
		};
		
		Person p = new Person(9, "Awesome Job");
		Function<Person, Integer> function = new Function<Person, Integer>() {

			@Override
			public Integer apply(Person t) {
				return t.getPersonId();
			}
		};
		
		Function<Person, Integer> function3 = (Person p3)-> {
				return p3.getPersonId();
		};
		
		Integer apply = function3.apply(p);
		System.out.println("apply+"+apply);
		
		System.out.println("apply****+"+functionmain.apply(p));
		Job apply2 = functionmain.apply(p);

	}
	
	

}

class Person {

	private int personId;
	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}

	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}

	/**
	 * @return the jobDescription
	 */
	public String getJobDescription() {
		return jobDescription;
	}

	/**
	 * @param jobDescription the jobDescription to set
	 */
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	private String jobDescription;

	public Person(int personId, String jobDescription) {
		super();
		this.personId = personId;
		this.jobDescription = jobDescription;
	}

}

class Job {

	private int personId;
	private String description;

	public Job(int personId, String description) {
		super();
		this.personId = personId;
		this.description = description;
	}

}

@FunctionalInterface
interface Test24 {
	public boolean get(String name);
}
