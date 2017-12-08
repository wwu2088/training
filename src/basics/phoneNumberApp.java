package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class phoneNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Java\\text file\\phoneNumber.txt";
		
		File file = new File(path);
		
		String pn = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			pn = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(pn.length() != 10)
				throw new tenDigitsException(pn);
			if(pn.substring(0, 1).equals("0") || pn.substring(0,1).equals("9"))
				throw new areaCodeException(pn);
			for(int n = 0; n < pn.length() -2; n++)
				if(pn.substring(n,n+3).equals("911"))
					throw new emergencyException(pn);
					
			System.out.println(pn);
		} catch(tenDigitsException t) {
		    System.out.println("ERROR: this is not a ten digit number");
			System.out.println(t.toString());
		} catch(areaCodeException a) {
			System.out.println("ERROR: can't start with 0 or 9");
			System.out.println(a.toString());
		} catch(emergencyException e) {
			System.out.println("ERROR: can't have 911 in phone");
			System.out.println(e.toString());
		} finally {
			System.out.println("Ended");
		}
	}
}

class tenDigitsException extends Exception{
	String num = null;
	tenDigitsException(String num){
		this.num = num;
	}
	
	public String toString() {
		return "tenDigitsException: " + num;
	}
}

class areaCodeException extends Exception{
	String num = null;
	areaCodeException(String num){
		this.num = num;
	}
	
	public String toString() {
		return "areaCodeException: " + num;
	}
}

class emergencyException extends Exception{
	String num = null;
	emergencyException(String num){
		this.num = num;
	}
	
	public String toString() {
		return "emergencyException: " + num;
	}
}