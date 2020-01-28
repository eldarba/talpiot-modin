package a;

public class Test2 {
	
	public static void main(String[] args) {
		
		AdvancedCalculator ac = new AdvancedCalculator();
		
		ac.add(100);
		System.out.println(ac.getResult());
		
		ac.power(2);
		System.out.println(ac.getResult());
		
		ac.reset();
		System.out.println(ac.getResult());
		
	}

}
