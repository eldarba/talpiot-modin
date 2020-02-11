package a.finalDemo;

public class Test {

	public static void main(String[] args) {

		System.out.println("persons created: " + Person.getCounter());

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		System.out.println("persons created: " + Person.getCounter());

		System.out.println("p1 id: " + p1.getId());
		System.out.println("p2 id: " + p2.getId());
		System.out.println("p3 id: " + p3.getId());
	}

}
