package a.finalDemo;

public class Test2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Danni");
		// since Person doesn't define extends it extends Object

		// use toString() method to convert an object to String
		String str = p1.toString();
		System.out.println(str);
	}

}
