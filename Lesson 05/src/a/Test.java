package a;

public class Test {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		System.out.println("result: " + calculator.getResult());
		
		calculator.add(10);
		System.out.println("result: " + calculator.getResult());
		calculator.sub(2);
		System.out.println("result: " + calculator.getResult());
		calculator.div(2);
		System.out.println("result: " + calculator.getResult());
		
	}

}
