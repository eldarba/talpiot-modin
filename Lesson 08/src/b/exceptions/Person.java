package b.exceptions;

public class Person {
	
	private int id;
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	// exception handling number 1 - declare
	public void setAge(int age) throws IllegalAgeException {
		if(age >=0 && age <= 120) {
			this.age = age;
		}else {
			// throwing an exception
			throw new IllegalAgeException("illegal age");
		}
	}
	
	
	
	
	
	
	
	
	
	

}
