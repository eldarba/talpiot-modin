package d.flowControl.whileLoop;

public class Demo1 {
	
	public static void main(String[] args) {
		
		int x = (int) (Math.random()*11);
		System.out.println(x);
		
		while(x != 5) {
			x = (int) (Math.random()*11);
			System.out.println(x);
		}
		
		System.out.println("== End ==");
	}

}
