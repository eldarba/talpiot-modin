package d.flowControl.whileLoop;

import java.util.Scanner;

public class Demo3Password {
	
	public static void main(String[] args) {
		
		int password = 123;
		
		System.out.print("enter password:");
		
		// get password from user
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		//
		
		while(userInput != password) {
			System.out.print("enter password:");
			userInput = sc.nextInt();
		}
		
		System.out.println("You are logged in");
		
		
		sc.close();
		
	}

}
