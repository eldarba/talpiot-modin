package b.loops.whileDemo;

public class Demo7 {
	
	public static void main(String[] args) {
		
		int c = 1; // we are using c as a counter for the outer loop
		// since the counter c runs up to 5 the loop will happen 5 times
		while(c <= 5) { // we expect the loop to run until c reached 5
			
			
			// this piece of code prints a line of 10 *
			//////////////////////
			int x = 1;
			while(x <= 10) {
				System.out.print(" * ");
				x++;
			}
			System.out.println();
			//////////////////////
			
			
			
			c++;// increment the outer loop counter
		}
		
		
		
		
		
		
	}
	
	

}
