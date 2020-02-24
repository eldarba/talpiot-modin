package c.exceptions.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		
		File file = new File("c:/temp/letter.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			System.out.println("file found");
			String line = sc.nextLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	}

}
