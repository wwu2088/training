package exceptionFiles;

import java.util.Scanner;

public class paymentApp {

	public static void main(String[] args) {
		double payment = 0;
		boolean pa = true;
		
		do {
			pa = true;
			System.out.print("Enter the payment amount: ");
		
			Scanner sc = new Scanner(System.in);
			
			try{
				payment = sc.nextDouble();
				if(payment < 0) {
					throw new NegativePaymentException(payment);
				}
			}catch (NegativePaymentException n) {
				System.out.println(n.toString());
				System.out.println("Please try again...");
				pa = false;
			}
		}while(!pa);
		
		System.out.println("Thank you for your payment of $" + payment);
		
		
	}

}
