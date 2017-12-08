package dataStructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class creditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String[]> detail = new ArrayList<String[]>();
		
		File fn = new File("C:\\Java\\text file\\creditCard.txt");
		String data = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fn));
			
			while((data = br.readLine()) != null) {
				String[] temp = data.split(",");
				detail.add(temp);
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		float balance = 0;
		
		for(String[] a : detail) {
			if(a[1].equals("CREDIT")) {
				balance += Float.parseFloat(a[3]);
			}else if (a[1].equals("DEBIT")) {
				balance -= Float.parseFloat(a[3]);
			}
		}
		
		if(balance > 0) {
			balance *= 0.9;
			balance = (float)Math.round(balance * 100)/100;
			System.out.println("Your balance is: " + balance);
		}else if (balance == 0) {
			balance = (float)Math.round(balance * 100)/100;
			System.out.println("Thanks for your payment.");
		}else {
			balance = (float)Math.round(balance * 100)/100;
			System.out.println("Thanks for your payment, your overpayment is: " + balance);
		}
	}

}
