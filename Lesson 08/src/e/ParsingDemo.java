package e;

public class ParsingDemo {
	
	public static void main(String[] args) {
		
		String str = "123";
		
		try {
			int x = Integer.parseInt(str);
			System.out.println(x);
			
			str = null;
			System.out.println(str.length());
		}catch(NumberFormatException e) {
			System.out.println("parsing failed");
		}catch (Exception e) {
			System.out.println("some other error");
		}
	}

}
