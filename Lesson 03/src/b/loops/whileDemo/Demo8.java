package b.loops.whileDemo;

public class Demo8 {

	public static void main(String[] args) {

		int x = 1;
		while (x <= 10) {
			
			// this piece of code will run 10 times
			///////////////////////////
			int y = 1;
			while (y <= 10) {
				System.out.print(x * y + "\t");
				y++;
			}
			System.out.println(); // new line
			///////////////////////////

			x++;
		}

	}

}
