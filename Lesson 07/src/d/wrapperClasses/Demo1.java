package d.wrapperClasses;

import javax.swing.JOptionPane;

public class Demo1 {

	public static void main(String[] args) {

		int a = 5; // primitive type
		Integer x = 5; // wrapper type
		Double y = 8.95; // wrapper type

		// get max value
		System.out.println("int max value = " + Integer.MAX_VALUE);

		// use wrraper classes to convert a string to int
		String str = JOptionPane.showInputDialog("enter a number");
		int val = Integer.parseInt(str);
	}

}
