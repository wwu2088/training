package exceptionFiles;

public class NegativePaymentException extends Exception{
	
	double payment;
	public NegativePaymentException(double payment) {
		System.out.println("ERROR: negtive payment");
		this.payment = payment;
	}
	
	@Override
	public String toString() {
		return "ERROR: Cannot take negative payment " + payment;
	}
}
