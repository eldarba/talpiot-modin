package c.loops.forDemo;

public class Demo1 {
	
	public static void main(String[] args) {
		// while loop - counts 1 to 10
		// we need while loop when there is no counter
		int x = 1;
		while(x <= 10) {
			System.out.println(x);
			x++;
		}
		
		// for loop - counts 1 to 10
		// for loop is always better in cases where we need a counter
		for(int y = 1;y <= 10;y++) {
			System.out.println(y);
		}
	}

}
