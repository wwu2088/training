package dataStructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String[]> data = new ArrayList<String[]>();
		
		String filename = "C:\\Java\\text file\\email.txt";
		String dataRow = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				data.add(line);
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String[] a : data) {
			for(String b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
	}

}
