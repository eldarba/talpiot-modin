package c.exceptions.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		File file = new File("c:/temp/letter.txt");

		try (Scanner sc = new Scanner(file);) {

			System.out.println("file found");
			String line = sc.nextLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
