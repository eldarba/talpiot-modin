package b.exceptions;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		try {
			p.setAge(25);
			System.out.println(p.getAge());
		}catch(IllegalAgeException e) {
			// handler block - runs in case of exception
			System.out.println("setting age failed");
			System.out.println(e.getMessage());
			e.printStackTrace(System.out);
			return; // exit the method
		}catch(Exception e) {
			System.out.println("something went wrong");
		}finally { // do it anyway block
			System.out.println("- END 1 -");
			
		}
		
		System.out.println("- END 2-");
	}

}
