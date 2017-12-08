package basics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Java\\text file\\fileToWrite.txt";
		
		File b = new File(filename);
		
		try {
			FileWriter fw = new FileWriter(b);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("Can I add this line, maybe?\n");
			pw.println("This is a new line.");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("write.");
		}
		
	}

}
