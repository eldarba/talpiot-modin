package d.operators;

public class Demo3Casting {

	public static void main(String[] args) {

		// casting is converting one type to another

		byte a = 5;
		int b = a; // implicit casting from byte to int

		int x = 200;
		byte y = (byte) x; // explicit casting from int to byte
		
		// explicit cast is needed when data can get lost
		
		System.out.println(y);
		
		
	}

}
