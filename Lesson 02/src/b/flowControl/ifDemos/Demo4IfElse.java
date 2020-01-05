package b.flowControl.ifDemos;

public class Demo4IfElse {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 61) + 50; // 50 - 110
		System.out.println("grade: " + grade);
		
		// grade < 56 ===> fail
		// grade < 65 ===> ok
		// grade < 80 ===> good
		// grade <= 100 ===> very good
		
		if(grade < 56) {
			System.out.println("FAIL");
		}else if(grade < 65) {
			System.out.println("OK");
		}else if(grade < 80) {
			System.out.println("GOOD");
		}else if(grade <= 100) {
			System.out.println("VERY GOOD");
		}else {
			System.out.println(grade + " is not a valide grade value");
		}

	}

}
