package b.flowControl.ifDemos;

public class Demo3_if_else {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 11);
		int y = (int) (Math.random() * 11);
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// assign the maximum value to the variable "max"
		int max = 0;
		if(x > y) {
			max = x;
		}else {
			max = y;
		}
		
		System.out.println("max = " + max);
		


		

	}

}
