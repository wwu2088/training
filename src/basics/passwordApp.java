package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class passwordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "C:\\Java\\text file\\password.txt";
		
		File pw = new File(file);
		
		List<String> pws = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(pw));
			String temp = br.readLine();
			
			do {
				pws.add(temp);
				temp = br.readLine();
			}while(temp != null);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int l = pws.size();
		
		for(int i = 0; i < l; i++) {
			String temp = pws.get(i);
			System.out.print(temp + " ");
			boolean number = checkNumber(temp);
			boolean letter = checkLetter(temp);
			boolean special = checkSpecial(temp);
			
			try {
					if(number)
						throw new noNumberException(temp);
					else if(letter)
						throw new noLetterException(temp);
					else if(special)
						throw new noSpecialException(temp);
					else
						System.out.println("Valid password");
						
			}catch(noNumberException n) {
				System.out.println("ERROR: Invalid password");
				System.out.println(n.toString());
			}catch(noLetterException n) {
				System.out.println("ERROR: Invalid password");
				System.out.println(n.toString());
			}catch(noSpecialException n) {
				System.out.println("ERROR: Invalid password");
				System.out.println(n.toString());
			}
			System.out.println("");
		}
		
	}

	private static boolean checkSpecial(String temp) {
		int l = temp.length();
		String special = "!@#$%^&*{}()_+-=[]\\;',./<>?:\"|";
		int s = special.length();
		boolean b = true;
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < s; j++) {
				if(temp.charAt(i) == special.charAt(j))
					b = false;
				if(!b)
					break;
			}
			if(!b)
				break;
		}
		return b;
	}

	private static boolean checkLetter(String temp) {
		int l = temp.length();
		String special = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWWXYZ";
		int s = special.length();
		boolean b = true;
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < s; j++) {
				if(temp.charAt(i) == special.charAt(j))
					b = false;
				if(!b)
					break;
			}
			if(!b)
				break;
		}
		return b;
	}

	private static boolean checkNumber(String temp) {
		int l = temp.length();
		String special = "0123456789";
		int s = special.length();
		boolean b = true;
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < s; j++) {
				if(temp.charAt(i) == special.charAt(j))
					b = false;
				if(!b)
					break;
			}
			if(!b)
				break;
		}
		return b;
	}

}

class noNumberException extends Exception{
	String pw = null;
	noNumberException(String pw){
		this.pw = pw;
	}
	public String toString() {
		return "noNumberException: " + pw;
	}
	
}

class noLetterException extends Exception{
	String pw = null;
	noLetterException(String pw){
		this.pw = pw;
	}
	public String toString() {
		return "noLetterException: " + pw;
	}
}

class noSpecialException extends Exception{
	String pw = null;
	noSpecialException(String pw){
		this.pw = pw;
	}
	public String toString() {
		return "noSpecialException: " + pw;
	}
}


