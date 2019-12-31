package e.random;

public class Demo2 {
	
	public static void main(String[] args) {
		
		int a = (int) (Math.random()*11);
		int b = (int) (Math.random()*11);
		int c = (int) (Math.random()*11);
		
		System.out.print(a);
		System.out.print(", ");
		System.out.print(b);
		System.out.print(", ");
		System.out.println(c);
		
		System.out.print("sum: ");
		System.out.println(a+b+c);
		
		
	}

}
