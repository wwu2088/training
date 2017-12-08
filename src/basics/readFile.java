package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Java\\text file\\fileToRead.txt";
		
		File a = new File(filename);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(a));
			System.out.println(br.readLine());
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: no file found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: no input");
			e.printStackTrace();
		} finally {
			System.out.println("Printed.");
		}
	}

}
