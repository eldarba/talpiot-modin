package b.loops.whileDemo;

public class Demo6 {
	
	public static void main(String[] args) {
		
		// counter is initialized to the letter we want to start with
		char c = 'A';
		
		while(c <= 'Z') {
			System.out.println(c + " - " + (int)c);
			c++;
		}
	}

}
