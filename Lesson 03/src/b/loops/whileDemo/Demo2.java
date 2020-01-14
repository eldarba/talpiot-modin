package b.loops.whileDemo;

public class Demo2 {

	public static void main(String[] args) {
		/* create random numbers in the range 1 - 6 until we get 6 */
		int r = 0;
		do {
			r = (int) (Math.random()*6) + 1;
			System.out.println("cube = " + r);
		}while(r != 6);
		
	}

}
